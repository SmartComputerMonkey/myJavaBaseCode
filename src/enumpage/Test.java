package enumpage;

public class Test {
	
	/**
	 * 枚举实现是在实例化时是线程安全
	 * @param args
	 */
	public static void main(String[] args) {
		TestClass t1 = DataSourceEnum.DATASOURCE.getTestClass();
		TestClass t2 = DataSourceEnum.DATASOURCE.getTestClass();
		System.out.println(t1 == t2);
	}
	
}
