package Thread.lx.chapter_four;

public class Synchronized {
	
	public static void main(String[] args) {
		
		//��Synchronized Class������м���
		synchronized(Synchronized.class) {}
	}
	public static synchronized void m() {}
}
