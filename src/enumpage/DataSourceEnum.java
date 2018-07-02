package enumpage;

public enum DataSourceEnum {
	
	DATASOURCE;
	private TestClass TestClass = null;
	private DataSourceEnum() {
		TestClass = new TestClass();
	}
	public TestClass getTestClass() {
		return TestClass;
	}
}
