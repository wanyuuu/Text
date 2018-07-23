package practice;

/**
 * Created by wanyu3 on 2018/7/23.
 */
//一个类要实现clone必须 实现Cloneable接口
public class Clone implements Cloneable{
    public static void main(String[] args) {
        Clone c = new Clone("wanyu");
        try {
            Clone c2 =  (Clone) c.clone(); //克隆的是一个新对象 而不是同一个引用
            System.out.println(c);
            System.out.println(c2);
            System.out.println(c.getName());
            System.out.println(c2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    private String name ;
    public Clone(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
