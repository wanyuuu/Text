package Inner;

/**
 * Created by wanyu on 2018/3/12.
 */
public class StaticInner {
    public static void main(String[] args) {
        StaticOuter.InnerClass.test2();
        StaticOuter.InnerClass is=new StaticOuter.InnerClass();
        is.test();
    }
}
class StaticOuter{
    static int a=100;
    static private int b=200;
    public static void test(){
        System.out.println("外部类静态测试");
    }
    public void test2(){
        System.out.println("外部类测试");
        new InnerClass().test2();  //两种创建内部类实例方法
        new StaticOuter.InnerClass().test2();
    }
    /*
    静态内部类（内部类中最简单的形式
    1、声明在类内部、方法体外，并用static修饰的内部类
   2、访问特点可以类比静态变量和静态方法
   3、在外部类的外部构建内部类实例
        new StaticOuter.InnerClass()
      在外部类内部构建内部类实例
        new InnerClass()
   4、静态内部类可以直接访问外部类中所有静态成员 包括私有变量
     */
    static class InnerClass{
        public int a=666;
        static int b=777;
        public void test(){
            System.out.println("内部类测试");
            StaticOuter.test();
            new StaticOuter().test2();
            System.out.println(a);
            System.out.println("StaticOuter.b="+StaticOuter.b);
        }
        public static void test2(){
            System.out.println("内部类静态测试");
        }
    }
}
