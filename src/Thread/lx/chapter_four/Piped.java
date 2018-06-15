package Thread.lx.chapter_four;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Piped {
	
	public static void main(String[] args) throws IOException {
		
		PipedWriter out = new PipedWriter();
		PipedReader in = new PipedReader();
		//将输出流和输入流进行连接，否则在使用时会抛出异常IOException
		out.connect(in);
		Thread PrintThread = new Thread(new Print(in),"PrintThread");
		PrintThread.start();
		int receive = 0;
		try {
			while((receive = System.in.read()) != -1) {
				out.write(receive);
			}
		} finally {
			out.close();
		}
	}
	
	static class Print implements Runnable {
		
		private PipedReader in;
		
		public Print(PipedReader in) {
			this.in = in;
		}
		@Override
		public void run() {
			int receive = 0;
			try {
				while((receive = in.read()) != -1) {
					System.out.println((char)receive);
				}
			} catch (Exception e) {
			}
		}
		
	} 
}
