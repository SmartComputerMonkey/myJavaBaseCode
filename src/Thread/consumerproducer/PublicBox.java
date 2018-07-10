package Thread.consumerproducer;

public class PublicBox {
    private int apple = 0;
    public synchronized void increace() {
        while (apple ==5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        apple++;
        System. out .println("����ƻ���ɹ���" );
        notify();
    }
    public synchronized void decreace() {
        while (apple ==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        apple--;
        System. out.println( "����ƻ���ɹ���" );
        notify();
    }

    public static void main(String []args)
    {
        PublicBox box= new PublicBox();

        Consumer con= new Consumer(box);
        Producer pro= new Producer(box);

        Thread t1= new Thread(con);
        Thread t2= new Thread(pro);

        t1.start();
        t2.start();


    }
}
