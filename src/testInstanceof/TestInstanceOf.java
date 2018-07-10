package testInstanceof;

public class TestInstanceOf {
    public static void main(String[] args) {
        //下面四行代码用来证明:instanceof运算符是判断对象变量中存放的引用的所属类是否与指定类相同，或者为指定类的后代类；而不是判断对象变量的所属类是否为指定类，或指定类的后代类
        A a1 = null;
        RootInterface ra = new A();
        System.out.println("a1 instanceof A:"+(a1 instanceof A));//null不是A类的实例对象，也不是A类的后代类的实例对象,故返回结果为false;
        System.out.println("ra instanceof RootInterface:"+(ra instanceof RootInterface));//true,原因在于对象变量ra中存放的引用的所属类为类A，而类A实现了接口RootInterface,可以理解为类A是接口RootInterface的子类
        System.out.println("ra instanceof A:"+(ra instanceof A));//对象变量ra中存放的引用的所属类为A类，故返回结果为true;

        //下面的代码用于验证只要对象变量中存放的引用的所属类是指定类或者是指定类的后代类，结果就为true；反之，结果为false；
        RootInterface rb = new B();
        RootInterface rc = new C();
        System.out.println("rb instanceof A:"+(rb instanceof A));//true,原因在于对象变量rb中存放的是类B的实例对象的引用,而指定类为类A,类B为类A的直接后代类，故返回true
        System.out.println("rb instanceof B:"+(rb instanceof B));//true,原因在于对象变量rb中存放的是类B的实例对象的引用,而指定类就是类B,两个类为同一个类，故返回true
        System.out.println("rc instanceof A:"+(rc instanceof A));//true,原因在于对象变量rc中存放的是类C的实例对象的引用,而指定类为类A,类C为类A的间接后代类，故返回true
        System.out.println("rb instanceof C:"+(rb instanceof C));//false,原因在于对象变量rb中存放的是类B的实例对象的引用,而指定类为类C,类B不是类C的后代类，故返回false
    }
}
