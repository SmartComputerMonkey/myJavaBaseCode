package enumpage;

public enum Temp {
	 /*还可以有构造方法*/  
	 /*通过括号赋值,而且必须有带参构造器和一属性跟方法，否则编译出错 
     * 赋值必须是都赋值或都不赋值，不能一部分赋值一部分不赋值 
     * 如果不赋值则不能写构造器，赋值编译也出错*/  
    absoluteZero(-459), freezing(32),boiling(212), paperBurns(451);  
      
    private final int value;  
    public int getValue() {  
        return value;  
    }  
    //构造器默认也只能是private, 从而保证构造函数只能在内部使用  
    Temp(int value) {  
        this.value = value;  
    }  
}
