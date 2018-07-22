package practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F {
    public static void main(String[] args) {
      //  String fii1=args[1];//运行错误
        int a[]=new int[10];
       // System.out.println(a[5]);
        String str="a";
        System.out.println(str.concat("hello"));//连接 等不更改对象
//        str.concat("adw");
        System.out.println(str);
    }
   private class InF{//内部类访问修饰符

    }
    @Test
    public void test(){
        List Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
    }
    @Test
    public void ok(){
        System.out.println(0%2);
        System.out.println(1%2);
        System.out.println(1/2);
        System.out.println(0/2);
    }
}
