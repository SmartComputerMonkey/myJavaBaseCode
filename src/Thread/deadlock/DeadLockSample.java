package Thread.deadlock;

public class DeadLockSample {

    //�������������Ա������Ķ�����ܲ���������ֻ��һ�����������������
    private final Object obj1 = new Object();
    private final Object obj2 = new Object();

    public static void main(String[] args) {
        DeadLockSample test = new DeadLockSample();
        test.testDeadlock();
    }

    private void testDeadlock() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                calLock_Obj1_First();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                calLock_Obj2_First();
            }
        });
        t1.start();
        t2.start();
    }

    //��synchronized  obj1����synchronized  obj2
    private void calLock_Obj1_First() {
        synchronized (obj1) {
            System.out.println("��ʼִ��obj1");
            sleep();
            System.out.println("obj˯��100");
            synchronized (obj2) {
                System.out.println("obj2......");
                sleep();
            }
        }
    }

    //��synchronized  obj2����synchronized  obj1
    private void calLock_Obj2_First() {
        synchronized (obj2) {
            System.out.println("��ʼִ��obj2");
            sleep();
            System.out.println("obj2˯��100");
            synchronized (obj1) {
                System.out.println("obj1......");
                sleep();
            }
        }
    }

    /**
     * Ϊ�˱����������̷ֱ߳���ס����һ������
     * һ���߳���סobj1��Ȼ��һֱ�ȴ�obj2��
     * ��һ���߳���סobj2��Ȼ��һֱ�ȴ�obj1��
     * Ȼ�����һֱ�ȴ�����������
     */
    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
