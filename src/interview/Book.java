package interview;

public class Book {
	
	 public static void main(String[] args)
	    {
	        staticFunction();
	    }
	 	
	    static Book book = new Book();

	    static {
	        System.out.println("��ľ�̬�����");//4
	    }

	    {
	       System.out.println("�����ͨ�����");//1
	    }

	    Book()
	    {
	        System.out.println("��Ĺ��췽��");//2
	        System.out.println("price=" + price +",amount=" + amount);//3
	    }

	    public static void staticFunction(){
	        System.out.println("��ľ�̬����");//5
	    }

	    int price = 110;
	    static int amount = 112;
	
}
