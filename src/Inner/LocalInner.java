package Inner;

import org.junit.Test;

/**
 * Created by wanyu on 2018/3/12.
 */
public class LocalInner {
    public static void main(String[] args) {
        new OuterClass().test();
        new OuterClass().test2();
    }
}
class OuterClass{
    private String name="万宇";
    private static String sex="男";
    public void test(){
        /*
            局部内部类 定义在方法体中 甚至比方法体更小的代码块中
            类比局部变量 所以不加任何修饰符
            所有内部类中最少使用的一种形式
         */
       //局部内部类访问方法中的局部变量 局部变量必须使用final修饰
        // jdk1.8以后就不用了
        String address="哈尔滨";
        final int a=5;
        class Inner{//如果在实例方法中 可以访问外部类中所有成员 包括私有成员
            public void InnerMethod(){
                System.out.println(name);
                System.out.println(sex);
//                System.out.println(address);
                System.out.println(a);
            }
        }
        new Inner().InnerMethod();
    }
    public static void test2(){
        class Inner{//如果在静态方法中 只可以访问外部类中所有静态成员 包括私有
            public  void InnerMethod(){
                System.out.println(sex);
//                System.out.println(name);
            }
        }
        new Inner().InnerMethod();
    }
}
