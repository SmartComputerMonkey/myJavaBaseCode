package enumpage;

/* ö��Ҳ������һ�����һ����ӷ���������,�����Ϊ����Ӿ�̬�ͷǾ�̬�����Ի򷽷�,��һ�ж�������һ���������������. */  
public enum Season {
	 // ö���б����д����ǰ�棬����������  
    winter, spring, summer, fall;  

    private final static String location = "Phoenix";          

    public static Season getBest() {  
        if (location.equals("Phoenix"))  
            return winter;  
        else  
            return summer;  
    }  
}
