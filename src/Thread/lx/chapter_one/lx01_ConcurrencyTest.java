package Thread.lx.chapter_one;

/**
 * 
 * 循环次数                           串                   并
 *   1W          0       1
 *   10W         4       4
 *   100W        6       5
 *   10000W      16      12
 *   100000W     95      70
 *
 *当并发执行累加操作不超过百万次时，速度会比串行执行累加操作要
      慢。那么，为什么并发执行的速度会比串行慢呢？这是因为线程有创建和上下文切换的开销
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
