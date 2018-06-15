package Thread.lx.chapter_four;

public class ThreadState {
	
	public static void main(String[] args) {
		new Thread(new TimeWaiting(),"TimeWaitingThread").start();
		new Thread(new Waiting(),"WaitingThread").start();
		//ʹ������Blocked�̣߳�һ����ȡ���ɹ�����һ��������
		new Thread(new Blocked(),"BlockedThread-1").start();
		new Thread(new Blocked(),"BlockedThread-2").start();
	}
	
	//���̲߳��ϵĽ���˯��
	static class TimeWaiting implements Runnable {

		@Override
		public void run() {
			while(true) {
				SleepUtils.second(100);
			}
		}
		
	}
	//���߳���waiting
	static class Waiting implements Runnable {

		@Override
		public void run() {
			while(true) {
				synchronized(Waiting.class) {
					try {
						Waiting.class.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}
	}
	//���߳���Blocked.classʵ���ϼ����󣬲����ͷŸ���
	static class Blocked implements Runnable {

		@Override
		public void run() {
			while(true) {
				synchronized(Blocked.class) {
					SleepUtils.second(100);
				}
			}
		}
	}
}
