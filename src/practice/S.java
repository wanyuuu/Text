package practice;

/**
 * Created by wanyu on 2018/4/10.
 */
public class S {
    public static void main(String[] args) {
        S s=new Son();
        s.go(); //会输出父亲  子类的go会把继承过来的static方法隐藏 而不是重写
    }
    public static void go(){
        System.out.println("父亲");
    }
}
class Son extends S{
    public static void go(){
        System.out.println("儿子");
    }
}
