package Fanshe;

import org.junit.Test;

import java.lang.reflect.Field;

public class Fields {
    Class c;

    {
        try {
            c = Class.forName("Fanshe.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getFields(){ //获取所有的共有字段
        Field fields[]=c.getFields();
        for(Field f:fields){
            System.out.println(f);
        }
    }
    @Test
    public void getDeclaredFields(){//获取所有的字段（啥都行）
        Field field[]=c.getDeclaredFields();
        for (Field ff:field) {
            System.out.println(ff);
        }
    }
    @Test
    public void getField(){ //获取指定公有字段并使用
        try {
            Field pf=c.getField("name");
            System.out.println(pf);
            Object obj=c.getConstructor().newInstance();//获取student对象并调用构造器
            pf.set(obj,"wanyu");
            Student stu=(Student) obj;
            System.out.println("名字是"+stu.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getDeclaredField(){//获取指定私有字段并使用（啥字段都行反正）
        try {
            Field ppf=c.getDeclaredField("phoneNum");
            System.out.println(ppf);
            Object oj=c.getConstructor().newInstance();
            Student st=(Student)oj;
            ppf.setAccessible(true);
            ppf.set(oj,"18845041227");//传入对象 传入实参
            System.out.println("电话是"+st);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
