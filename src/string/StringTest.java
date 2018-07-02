package string;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void testReplaceFirsReplaceAllReplace(){
		String str = "my.test.txt";
		System.out.println(str.replaceFirst(".", "#"));
		System.out.println(str.replaceAll(".", "#"));
		System.out.println(str.replace(".", "#"));
	}
	@Test
	public void ToStringAndValueOf() {
		System.out.println(String.valueOf(null)+"");
//		System.out.println(null);
	}
	@Test
	public void StringTest() {
		String c1=new String("abc");
        String c2=new String("abc");
        String c3=c1;
        System.out.println("c1==c2:"+  (c1==c2));
        System.out.println("c1.equals(c2):"+c1.equals(c2));
        System.out.println("c3==c1:"+(c3==c1));
        System.out.println("c1.equals(c3):"+c1.equals(c3));
        c1="han";
        System.out.println(c1+"   "+c3);
        System.out.println(""+(c3==c1));    
	}
}
