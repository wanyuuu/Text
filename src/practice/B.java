package practice;

public class B {
    private int a=5;
    public static void main(String[] args) {
     int a=4;
     Integer a1=4;
     Integer a2=new Integer(4);
     System.out.println(a==a1);
        System.out.println(a==a2);//int和Integer比较值
        System.out.println(a1==a2);//比较的是地址
    }
    public void ok(){
        new B().a=4;
    }
    static public void go(){

    }
}
class C2 extends B{
    public void ok(){
        int a=5;
      //  super();//必须在第一行
    }
}
abstract class D{
    private int a;
    public int b;
    static int c;
    public void ok(){

    }
    abstract public void go();
}
interface E{
    public void ok();//只允许public因为需要被实现
     final int a=6;
     static final int c=5;//接口中变量必须是final
}
