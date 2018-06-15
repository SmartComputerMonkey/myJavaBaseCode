package Thread.lx.chapter_four;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Piped {
	
	public static void main(String[] args) throws IOException {
		
		PipedWriter out = new PipedWriter();
		PipedReader in = new PipedReader();
		//����������������������ӣ�������ʹ��ʱ���׳��쳣IOException
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
