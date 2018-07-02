package enumpage;

/* 枚举也可以象一般的类一样添加方法和属性,你可以为它添加静态和非静态的属性或方法,这一切都象你在一般的类中做的那样. */  
public enum Season {
	 // 枚举列表必须写在最前面，否则编译出错  
    winter, spring, summer, fall;  

    private final static String location = "Phoenix";          

    public static Season getBest() {  
        if (location.equals("Phoenix"))  
            return winter;  
        else  
            return summer;  
    }  
}
