package Thread;

import org.junit.Test;

/**
 * Created by wanyu on 2018/4/3.
 */
public class A implements Runnable {
    @Test
    public void test(){
        Thread thread=new Thread(new A());
        thread.start();
    }
    @Override
    public void run() {
        for(int i=0;i<4;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
