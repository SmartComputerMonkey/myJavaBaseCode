package Thread.lx.chapter_four;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 *  [5] Attach Listener 
	[4] Signal Dispatcher �ַ������͸�jvm�źŵ��߳�
	[3] Finalizer ���ö���finalize�������߳�
	[2] Reference Handler ���Reference���߳�
	[1] main main�̣߳��������
 * @author Administrator
 *
 */

public class MultiThread {
	
	public static void main(String[] args) {
		
		//���java�̹߳���MXBean
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean(); 
		//����Ҫ��ȡͬ����monitor��synchronizer��Ϣ������ȡ�̺߳��̶߳�ջ��Ϣ
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		//�����߳���Ϣ������ӡ�߳�id���߳�������Ϣ
		for (ThreadInfo threadInfo : threadInfos) {
			System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
		}
	}
}
