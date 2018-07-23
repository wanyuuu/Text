package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by wanyu on 2018/7/22.
 */
public class LockTest {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockTest.intoThread(Thread.currentThread());
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockTest.intoThread(Thread.currentThread());
            }
        },"t2");
        t1.start();
        t2.start();
    }
    public static void intoThread(Thread thread){
        try
        {
            if(lock.tryLock()){
                lock.lock();
                System.err.println(Thread.currentThread().getName()+"已获取了锁");
            }else {
                System.err.println(Thread.currentThread().getName()+"想要获取锁,锁已被占用");
            }
        }finally {
            if(lock.tryLock()){
                lock.unlock();
                System.err.println(Thread.currentThread().getName()+"已释放了锁");
            }
        }
    }
}
