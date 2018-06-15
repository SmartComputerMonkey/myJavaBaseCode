package Thread.lx.chapter_two;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class lx01_CAS {
	
	private AtomicInteger atomicI = new AtomicInteger();
	private int i = 0;
	public static void main(String[] args) {
		final lx01_CAS cas = new lx01_CAS();
		List<Thread> ts = new ArrayList<Thread>(600);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			Thread t = new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int j = 0; j < 1000; j++) {
						cas.count();
						cas.safeCount();
					}
				}
			});
			ts.add(t);
		}
		for (Thread thread : ts) {
			thread.start();
		}
		//�ȴ������߳�ִ�����
		for (Thread thread : ts) {
			try {
				thread.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(cas.i);
		System.out.println(cas.atomicI.get());
		System.out.println(System.currentTimeMillis() - start);
	}

	/** * ʹ��CASʵ���̰߳�ȫ������ */
	private void safeCount() {
		for (;;) {
			int i = atomicI.get();
			boolean suc = atomicI.compareAndSet(i, ++i);
			if (suc) {
				break;
			}
		}
	}
	
	/**
	 * ���̰߳�ȫ������
	 */
	private void count() {
		i++;
	}
}
