package Inner;

/**
 * Created by wanyu on 2018/3/12.
 */
public class NonameInner {
    public static void main(String[] args) {
       Person person=new Person();
        person.User(new Telephone() {
            /*
            匿名内部类 没有名字的局部内部类
            没有class、interface、extends、implements关键字
            没有构造器
            一般隐式的继承一个父类或实现一个接口
             */
            @Override
            public void call() {
                System.out.println("苹果手机打电话");
            }
        });
    }
}
class Person{
    public void User(Telephone tl){
        tl.call();
    }
}
class Iphone implements Telephone{

    @Override
    public void call() {

    }
}
