package Thread.lx.chapter_one;

/**
 * 
 * ѭ������                           ��                   ��
 *   1W          0       1
 *   10W         4       4
 *   100W        6       5
 *   10000W      16      12
 *   100000W     95      70
 *
 *������ִ���ۼӲ��������������ʱ���ٶȻ�ȴ���ִ���ۼӲ���Ҫ
      ������ô��Ϊʲô����ִ�е��ٶȻ�ȴ������أ�������Ϊ�߳��д������������л��Ŀ���
 */
public class lx01_ConcurrencyTest {
	
	private static final long count = 100000l;
	
	public static void main(String[] args) {
		concurrency();
		serial();
	}

	private static void serial() {
		
		long start = System.currentTimeMillis();
		int a = 0;
		for (long i = 0; i < count; i++) {
			a += 5;
		}
		int b = 0;
		for (long i = 0; i < count; i++) {
			b--;
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("serial:" + time+"ms,b="+b+",a="+a);
	}

	private static void concurrency() {
		
		long start = System.currentTimeMillis();
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int a = 0;
				for (long i = 0; i < count; i++) {
					a += 5;
				}
			}
		});
		thread.start();
		int b = 0;
		for (long i = 0; i < count; i++) {
			b--;
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("conurrency : " + time + "ms,b = " + b);
	}
}
