package Thread.consumerproducer2;

import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable {

    private final BlockingQueue conQueue;

    public ConsumerQueue(BlockingQueue conQueue)
    {
        this .conQueue =conQueue;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i=0;i<10;i++)
        {
            try {
                System. out .println("���������ѵ�ƻ�����Ϊ ��" +conQueue .take());
                Thread. sleep(3000);  //������sleep��Ϊ�˿��ĸ������Щ

            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
