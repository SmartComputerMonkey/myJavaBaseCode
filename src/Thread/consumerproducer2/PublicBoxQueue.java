package Thread.consumerproducer2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * ��������ʵ��������������ģʽ�����򵥣����ṩ���伴��֧�������ķ���put()��take()��
 * �����߲���Ҫд�����wait-nofity����ȥʵ��ͨ�š�BlockingQueue һ���ӿڣ�
 * Java5�ṩ�˲�ͬ����ʵ����ArrayBlockingQueue��LinkedBlockingQueue�����߶����Ƚ��ȳ���FIFO��˳��
 * ��ArrayLinkedQueue����Ȼ�н�ģ�LinkedBlockingQueue��ѡ�ı߽硣
 * ��������һ�������������������ߴ������ӣ��Աȴ�ͳ��wait��nofity���룬�����������
 */
public class PublicBoxQueue {

    public static void main(String []args)
    {
        BlockingQueue publicBoxQueue= new LinkedBlockingQueue(5);   //������һ����СΪ5�ĺ���

        Thread pro= new Thread(new ProducerQueue(publicBoxQueue));
        Thread con= new Thread(new ConsumerQueue(publicBoxQueue));

        pro.start();
        con.start();
    }
}
