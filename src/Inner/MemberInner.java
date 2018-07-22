package Inner;

/**
 * Created by wanyu on 2018/3/12.
 */
public class MemberInner {

    public static void main(String[] args) {
        OuterMember om=new OuterMember();
        om.test();   //外部类测试
        om.new InnerMember().test(); //内部类测试
    }
}
 class OuterMember{
    private static int a=100;
    private static int b=200;

    /*
    成员内部类 没有用static修饰的内部类
    1、成员内部类中不允许出现静态变量和静态方法的声明
        只能用在静态常量的声明上
        成员内部类中可以访问外部类中所有的成员、包括私有成员
     */
    public void test(){
        new InnerMember().test();
    }
     class InnerMember{   //跟方法一个级别 所以非静态类中不能有静态变量和静态方法 可以访问外部类中的所有成员
        int b = 5;
        static final int a=8;//静态常量
        public void test(){
            System.out.println(a);
            System.out.println(OuterMember.this.a);//当内部类和外部类有相同方法名时
            System.out.println(b);
        }
    }
}
