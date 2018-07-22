package Fanshe;

import java.lang.reflect.Method;

public class Main { //反射main方法
    public static void main(String[] args) {
        try {
            Class c=Class.forName("Fanshe.Student");//获取Student的字节码
            Method method=c.getMethod("main",String[].class);//获取main方法
            System.out.println(method);
         //   Object obj=c.getConstructor().newInstance();
            //为空是因为方位是静态方法，可以不关联对象
            method.invoke(null,(Object) new String[]{"1","2","3"});//调用方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
