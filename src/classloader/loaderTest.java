package classloader;

public class loaderTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
//		ClassLoader loader = HelloWorld.class.getClassLoader();
//		System.out.println(loader);
		//ʹ��ClassLoader.loaderClass()��������
//		loader.loadClass("Test2");
		//ʹ��class.forName()����d� Ĭ�ϻ�ִ�г�ʼ����
		Class.forName("Test2");
		//ʹ��Class.forName()�������࣬��ָ��ClassLoader����ʼ��ʱ��ִ�о�̬��
		//Class.forName("Test2",false,loader);
	}
}
