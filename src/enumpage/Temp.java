package enumpage;

public enum Temp {
	 /*�������й��췽��*/  
	 /*ͨ�����Ÿ�ֵ,���ұ����д��ι�������һ���Ը����������������� 
     * ��ֵ�����Ƕ���ֵ�򶼲���ֵ������һ���ָ�ֵһ���ֲ���ֵ 
     * �������ֵ����д����������ֵ����Ҳ����*/  
    absoluteZero(-459), freezing(32),boiling(212), paperBurns(451);  
      
    private final int value;  
    public int getValue() {  
        return value;  
    }  
    //������Ĭ��Ҳֻ����private, �Ӷ���֤���캯��ֻ�����ڲ�ʹ��  
    Temp(int value) {  
        this.value = value;  
    }  
}
