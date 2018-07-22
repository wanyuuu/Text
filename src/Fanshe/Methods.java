package Fanshe;

import org.junit.Test;

import java.lang.reflect.Method;

public class Methods {
    Class c;

    {
        try {
            c = Class.forName("Fanshe.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getMethods(){//获取所有公有方法 也包含了父类Object的方法
        Method md[]=c.getMethods();
        for(Method m:md){
            System.out.println(m);
        }
    }
    @Test
    public void getDeclaredMethods(){//获取所有方法 不包括继承的
        Method md[]=c.getDeclaredMethods();
        for (Method m:md) {
            System.out.println(m);
        }
    }
    @Test
    public void getMethod(){//获取指定公有方法
        try {
            Method md=c.getMethod("show",String.class);
            System.out.println(md);
            Object obj=c.getConstructor().newInstance();//获取对象（调用了构造器）
            md.invoke(obj,"万万万");//调用了方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getDeclaredMethod(){//获取指定私有方法
        try {
            Method md=c.getDeclaredMethod("show4",int.class);
            System.out.println(md);
            Object obj=c.getConstructor().newInstance();
            md.setAccessible(true);
           Object result= md.invoke(obj,50);
           System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
