package Thread.consumerproducer;

public class Consumer implements  Runnable{
    private PublicBox box;

    public Consumer(PublicBox box) {
        this .box = box;
    }

    @Override
    public void run() {

        for( int i=0;i<10;i++)
        {
            try {
                System. out .println("Con: i " +i);
                Thread. sleep(3000);                // �������ø�����30��ͬ��Ϊ�� �����е�ƻ���ܹ����ӣ���������һ�����ϱ�����
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

            box.decreace();
        }
    }
}
