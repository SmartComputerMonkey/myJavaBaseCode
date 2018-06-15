package Thread.lx.chapter_four;

public class Synchronized {
	
	public static void main(String[] args) {
		
		//对Synchronized Class对象进行加锁
		synchronized(Synchronized.class) {}
	}
	public static synchronized void m() {}
}
