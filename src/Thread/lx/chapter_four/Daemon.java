package Thread.lx.chapter_four;

/**
 * ����Daemon���򣬿��Կ������ն˻���������ʾ����û���κ������main�̣߳�Daemon�̣߳����������߳�DaemonRunner֮������
 * main����ִ����϶����գ�����ʱjava��������Ѿ�û�з�Daemon�̣߳��������Ҫ�˳���Java������е�����Daemon�̶߳�
 * ��Ҫ������ֹ����˽DaemonRunner������ֹ������DaemonRunner�е�finally�鲢û��ִ��
 * 
 * ע��
 * 		�ڹ���Daemon�߳�ʱ����������finally���е�������ȷ��ִ�йرջ���������Դ���߼�
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
