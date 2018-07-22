package Fanshe;

import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {//通过反射加载配置文件
    public static void main(String[] args) {
        try {
            Class c=Class.forName(getValue("className"));//获取Class对象
            Method m=c.getMethod(getValue("methodName"));//获取show方法
            Object obj=c.getConstructor().newInstance();
            m.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public static String getValue(String key){
       Properties pro=new Properties();//获取配置文件的对象
       try {
           FileReader in=new FileReader("pro.txt");//获取输入流
           pro.load(in);//将流加载到配置对象文件中
           in.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return pro.getProperty(key);//返回根据key得到的值
   }
}
