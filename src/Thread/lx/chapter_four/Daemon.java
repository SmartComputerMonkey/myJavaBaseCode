package Thread.lx.chapter_four;

/**
 * 运行Daemon程序，可以看到在终端或者命令提示符上没有任何输出。main线程（Daemon线程）在启动了线程DaemonRunner之后随着
 * main方法执行完毕而告终，而此时java虚拟机中已经没有非Daemon线程，虚拟机需要退出。Java虚拟机中的所有Daemon线程都
 * 需要立即终止，隐私DaemonRunner立即终止，但是DaemonRunner中的finally块并没有执行
 * 
 * 注意
 * 		在构建Daemon线程时，不能依靠finally块中的内容来确保执行关闭或者清理资源的逻辑
 * @author Administrator
 *
 */

public class Daemon {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonRunner(),"DaemonRunner");
		thread.setDaemon(true);
		thread.start();
	}
	
	static class DaemonRunner implements Runnable {

		@Override
		public void run() {
			try {
				SleepUtils.second(10);
			} finally {
				System.out.println("DaemonThread finally run.");
			}
		} 
		
	}
}
