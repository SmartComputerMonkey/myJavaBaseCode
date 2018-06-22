package classloader;

public class ClassLoaderTest {
	
	public static void main(String[] args) {
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println(loader);
		System.out.println(loader.getParent());
		System.out.println(loader.getParent().getParent());
		
		/**
		 * 并没有获取到 ExtClassLoader的父Loader，原因是 BootstrapLoader（引导类加载器）是用C语言实现的，
		 * 找不到一个确定的返回父Loader的方式，于是就返回null。
		 */
	}
}
