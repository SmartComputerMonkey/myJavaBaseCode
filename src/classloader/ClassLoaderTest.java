package classloader;

public class ClassLoaderTest {
	
	public static void main(String[] args) {
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println(loader);
		System.out.println(loader.getParent());
		System.out.println(loader.getParent().getParent());
		
		/**
		 * ��û�л�ȡ�� ExtClassLoader�ĸ�Loader��ԭ���� BootstrapLoader�������������������C����ʵ�ֵģ�
		 * �Ҳ���һ��ȷ���ķ��ظ�Loader�ķ�ʽ�����Ǿͷ���null��
		 */
	}
}
