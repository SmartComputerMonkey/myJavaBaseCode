package Thread.lx.chapter_five;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Mutex implements Lock {

	//静态内部类，自定义同步器
	private static class Sync extends AbstractQueuedSynchronizer{
		//是否处于占用状态
		protected boolean isHeldExclusively() {
			return getState() == 1;
		}
		//当状态为0的时候获取锁
		public boolean tryAcquire(int acquires) {
			if (compareAndSetState(0, 1)) {
				setExclusiveOwnerThread(Thread.currentThread());
				return true;
			}
			return false;
		}
		//释放锁，将状态设置为0
		protected boolean tryRelease(int releases) {
			if (getState() == 0) throw new IllegalMonitorStateException();
			setExclusiveOwnerThread(null);
			setState(0);
			return true;
		}
		// 返回一个Condition，每个condition都包含了一个condition队列
		Condition newCondition() {return new ConditionObject();}
	}
	//仅需要将操作代理到Sync上即可
	private final Sync sync = new Sync();
	@Override
	public void lock() {sync.acquire(1);}

	@Override
	public void lockInterruptibly() throws InterruptedException {sync.acquireInterruptibly(1);}

	@Override
	public Condition newCondition() {return sync.newCondition();}

	@Override
	public boolean tryLock() {return sync.tryAcquire(1);}

	@Override
	public boolean tryLock(long arg0, TimeUnit arg1) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unlock() {sync.release(1);}

}
