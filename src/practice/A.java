package practice;

import org.junit.Test;

public class A {
    @Test
    public void test(){
        byte a=11,b=12,c;
        System.out.println(b);
        Integer i=new Integer(10);
        Double d=10.0;
        int i1=10;
        System.out.println(i==i1);
        System.out.println(i.equals(d));
        String str="true";
        String st=new String("true");
        System.out.println(str.equals(st));
    }
}
class Tt extends Thread{
    public static void main(String[] args) {
        Tt t=new Tt();
        t.run();
    }
}
