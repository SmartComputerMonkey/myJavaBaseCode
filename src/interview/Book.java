package interview;

public class Book {
	
	 public static void main(String[] args)
	    {
	        staticFunction();
	    }
	 	
	    static Book book = new Book();

	    static {
	        System.out.println("书的静态代码块");//4
	    }

	    {
	       System.out.println("书的普通代码块");//1
	    }

	    Book()
	    {
	        System.out.println("书的构造方法");//2
	        System.out.println("price=" + price +",amount=" + amount);//3
	    }

	    public static void staticFunction(){
	        System.out.println("书的静态方法");//5
	    }

	    int price = 110;
	    static int amount = 112;
	
}
