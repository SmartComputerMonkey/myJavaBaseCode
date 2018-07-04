package integer;

import org.junit.Test;

public class IntegerTest {
	
	@Test
	public void testIntegerCache() {
		
		Integer num1 = new Integer(100);
		Integer num2 = new Integer(100);
		System.out.println("num1==num2 " + (num1 == num2));
		Integer num3 = 100;
		Integer num4 = 100;
		System.out.println("num3==num4 " +(num3 == num4));
		Integer num5 = 128;
		Integer num6 = 128;
		System.out.println("num5==num6 " + (num5 == num6));
		Integer num7 = 100;
		Integer num8 = new Integer(100);
		System.out.println("num7==num8 " + (num7 == num8));
		int num9 = 100;
		Integer num10 = new Integer(100);
		Integer num11 = 100;
		System.out.println("num9==num10 " + (num9 == num10));
		System.out.println("num9==num11 " + (num9 == num11));
	}
}
