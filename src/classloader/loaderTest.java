package classloader;

public class loaderTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
//		ClassLoader loader = HelloWorld.class.getClassLoader();
//		System.out.println(loader);
		//使用ClassLoader.loaderClass()来加载类
//		loader.loadClass("Test2");
		//使用class.forName()來加載類 默认会执行初始化块
		Class.forName("Test2");
		//使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
		//Class.forName("Test2",false,loader);
	}
}
