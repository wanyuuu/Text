package Fanshe;

public class Student {
    public static void main(String[] args) {
        System.out.println("main方法执行了");
    }
    public String name;
    protected int age;
    char sex;
    private String phoneNum;
    Student(String str){
        System.out.println("这是默认构造方法"+str);
    }
    public Student(){
        System.out.println("这是共有构造方法");
    }
    public Student(char name){
        System.out.println("姓名"+name);
    }
    public Student(String name,int age){
        System.out.println("姓名"+name+"年龄"+age);
    }
    protected Student(boolean flag){
        System.out.println("这是受保护的构造方法"+flag);
    }
    private Student(int age){
        System.out.println("这是私有的构造方法"+age);
    }

    @Override
    public String toString() {
        return this.phoneNum;
    }
    public void show(String str){
        System.out.println("调用了公有的String参数方法"+str);
    }
    protected void show2(){
        System.out.println("调用了受保护的无参方法");
    }
    void show3(){
        System.out.println("调用了默认无参方法");
    }
    private String show4(int age){
        System.out.println("调用了私有的、有返回值带int参数的方法");
        return "abc"+age;
    }
}
