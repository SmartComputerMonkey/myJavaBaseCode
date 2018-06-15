package Thread.lx.chapter_one;

/**
 * 使线程t1和线程t2互相等待对方释放锁
 * 
 *
 */

public class lx02_DeadLockTest {
	
	private static String A = "A";
	private static String B = "B";
	
	public static void main(String[] args) {
		new lx02_DeadLockTest().deadLock();
	}
	
	private void deadLock() {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (A) {
					try {
						Thread.currentThread().sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					synchronized (B) {
						System.out.println("1");
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (B) {
					synchronized(A){
						System.out.println("2");
					}
				}
			}
		});
		t1.start();
		t2.start();
	}
}
