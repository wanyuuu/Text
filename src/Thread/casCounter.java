package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wanyu3 on 2018/7/23.
 */
public class casCounter {
    /*
    CAS操作能解决原子操作 但仍存在三大问题
    1、ABA问题 CAS在操作值得时候需要检查值有没有变化 没有变化则更新 但如果一个值由 A 到 B 又到 A 则检查不出变化
    实际上已经发生变化 。解决思路使用版本号 在变量前面加上版本号 每次更新版本号+1
    2、循环时间长开销大。自旋CAS长时间不成功，会造成非常大的CPU开销。
    3、只能保证一个共享变量的原子操作。用锁。
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);//安全的
    private int i = 0;//不安全的
    public static void main(String args[]){
        final casCounter casCounter = new casCounter();
        List<Thread> list = new ArrayList<Thread>();
        long start = System.currentTimeMillis();
        for(int i = 0;i<100;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0;j<100;j++){
//                        casCounter.count();
                        casCounter.safeCount();
                    }
                }
            });
           t.start();
        }
        for(Thread t:list){
            t.start();
        }
        for (Thread t : list) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(casCounter.i);
        System.out.println(casCounter.atomicInteger.get());
        System.out.println(System.currentTimeMillis() - start);
    }
    private void safeCount(){
        for(;;){
            int i = atomicInteger.get();// 初始值是0
            boolean bool = atomicInteger.compareAndSet(i,++i);
            if(bool){
                break;
            }
        }
    }
    private void count(){
        i++;
    }
}
