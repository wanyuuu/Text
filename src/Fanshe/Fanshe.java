package Fanshe;

public class Fanshe {
    public static void main(String[] args) {
        //第一种Object getClass()方法
        Student stu=new Student();//产生一个Student对象 一个Class对象
        Class c=stu.getClass();
        System.out.println(c.getName());
        //第二种
        Class c1=Student.class;//任何数据类型（包括基本类型）都有一个静态的“class”属性
        System.out.println(c1.getName());
        //第三种 通过Class类的静态方法：forName 常用 可传入 可写入配置文件
        try {
            Class c2=Class.forName("Fanshe.Student");//带包名的路径
            System.out.println(c2.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
