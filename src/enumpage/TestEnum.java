package enumpage;

public class TestEnum {
	  
  
    public static void main(String[] args) {  
    	/* 
         * ö��������һ�����ͣ����ڶ�������������Ʊ����ĸ�ֵ ��ֵʱͨ��"ö����.ֵ"��ȡ�����ö���е�ֵ 
         */ 
    	ColorSelect m = ColorSelect.blue;
    	switch (m) {
    	/*ע��:ö����д��ToString(),˵��ö�ٱ�����ֵ�ǲ���ǰ׺�� 
         *����Ϊblue����ColorSelect.blue 
         */  
		case red:
			System.out.println("color is red");  
            break; 
		case green:  
            System.out.println("color is green");  
            break;
		case yellow:  
            System.out.println("color is yellow");  
            break;  
        case blue:  
            System.out.println("color is blue");  
            break;  
		default:
			break;
		}
    	 System.out.println("����ColorSelect�е�ֵ");  
         /*ͨ��values()���ö��ֵ������*/  
         for (ColorSelect c : ColorSelect.values()) {  
             System.out.println(c);  
         }
      System.out.println("ö��ColorSelect�е�ֵ�У�"+ColorSelect.values().length+"��");
        /*ordinal()����ö��ֵ��ö���е�����λ�ã���0��ʼ*/  
      System.out.println(ColorSelect.red.ordinal());//0  
      System.out.println(ColorSelect.green.ordinal());//1  
      System.out.println(ColorSelect.yellow.ordinal());//2  
      System.out.println(ColorSelect.blue.ordinal());//3
      /*ö��Ĭ��ʵ����java.lang.Comparable�ӿ�*/   
    System.out.println(ColorSelect.red.compareTo(ColorSelect.green));  
      
    System.out.println(Season.getBest());  
              
     for(Temp t:Temp.values()){  
          /*ͨ��getValue()ȡ�����ö�ٵ�ֵ*/  
          System.out.println(t+"��ֵ��"+t.getValue());  
        }  
    }
}
