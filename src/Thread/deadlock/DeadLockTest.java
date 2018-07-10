package Thread.deadlock;

public class DeadLockTest {

    public static final Object test1 = new Object();
    public static final Object test2 = new Object();

    public static void main(String[] args) {
        DeadLockTest deadLockTest = new DeadLockTest();
        deadLockTest.excuteMethod();
    }
    public   void excuteMethod() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                excuteMethodTest1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                excuteMethodTest2();
            }
        });
        thread1.start();
        thread2.start();
    }

    public void excuteMethodTest1() {
        synchronized (test1){
            System.out.println("test1");
            sleep();
            synchronized (test2){
                System.out.println("test1。。。。。");
                sleep();
            }
        }
    }

    public void excuteMethodTest2() {
        synchronized (test2){
            System.out.println("test2");
            sleep();
            synchronized (test1){
                System.out.println("test1。。。。。");
                sleep();
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
