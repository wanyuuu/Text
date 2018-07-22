package Fanshe;

import org.junit.Test;


import java.lang.reflect.Constructor;

public class Constructors {
    static Class c=Student.class;
    public static void main(String[] args) {
//        Constructor con[]=c.getConstructors();//获取所有共有的构造方法
//        for (Constructor co:con) {
//            System.out.println(co);
//        }
//        Constructor cons[]=c.getDeclaredConstructors();//获取所有的构造方法
//        for(Constructor coo:cons){
//            System.out.println(coo);
//        }
        try {
            Constructor con2=c.getConstructor(null);//获取无参构造方法  按要求写参数类型
            System.out.println(con2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
        try {
            Object obj=c.newInstance();//调用共有无参构造方法
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void ok() {
        try {
            Constructor c3=c.getDeclaredConstructor(int.class);//获取有参构造方法
            Constructor c4=c.getDeclaredConstructor(boolean.class);
            System.out.println(c3);
            c3.setAccessible(true);//暴力访问 忽略修饰符
            Object obj2=c3.newInstance(5);//调用构造方法
            Object obj3=c4.newInstance(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
