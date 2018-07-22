package practice;

/**
 * Created by wanyu on 2018/5/13.
 */
public abstract class Father {
    public Father(){

    }
    public void eat(){}
    protected abstract void drink();
    public abstract void run();
    abstract void hh();//同包下可以重写 不同包不可以
}
