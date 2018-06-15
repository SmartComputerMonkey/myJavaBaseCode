package Thread.lx.chapter_four;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Deprecated {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Thread printThread = new Thread(new Runner(),"PrintThread");
		printThread.setDaemon(true);
		printThread.start();
		TimeUnit.SECONDS.sleep(3);
		//��PrintThread������ͣ��������ݹ���ֹͣ
		printThread.suspend();
		System.out.println("main suspend PrintThread at " + format.format(new Date()));
		TimeUnit.SECONDS.sleep(3);
		//��PrintThread���лָ���������ݼ���
		printThread.resume();
		System.out.println("main resume PrintThread at " + format.format(new Date()));
		TimeUnit.SECONDS.sleep(3);
		//��PrintThread������ֹ���������ֹͣ
		printThread.stop();
		System.out.println("main stop PrintThread at " + format.format(new Date()));
		TimeUnit.SECONDS.sleep(3);
	}
	
	static class Runner implements Runnable {

		@Override
		public void run() {
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			while(true) {
				System.out.println(Thread.currentThread().getName() + "Run at " +
						format.format(new Date()));
				SleepUtils.second(1);
			}
		}
		
	}
}
