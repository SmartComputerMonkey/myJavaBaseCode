package enumpage;

public class Test {
	
	/**
	 * ö��ʵ������ʵ����ʱ���̰߳�ȫ
	 * @param args
	 */
	public static void main(String[] args) {
		TestClass t1 = DataSourceEnum.DATASOURCE.getTestClass();
		TestClass t2 = DataSourceEnum.DATASOURCE.getTestClass();
		System.out.println(t1 == t2);
	}
	
}
