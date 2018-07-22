package CCF;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/27.
 */
public class J {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();//工作数量
        int m=cin.nextInt();//小伙伴数量
        List<Job> list=new ArrayList<Job>();
        List<Student> stulist=new ArrayList<Student>();
        for(int i=0;i<n;i++){
            Job job=new Job(cin.nextInt(),cin.nextInt()); //难度 报酬
            list.add(job);
        }
        for(int i=0;i<m;i++){
            Student student=new Student(cin.nextInt());//小伙伴能力值
            stulist.add(student);
        }

        for(int i=0;i<stulist.size();i++){
            int skill=stulist.get(i).getStrong();//获取每个人的能力值
            int max=0;
            for(int j=0;j<list.size();j++){
                if(skill>=list.get(j).getDiffcult()){
                    if(list.get(j).getMoney()>max){
                        max=list.get(j).getMoney();//最多报酬
                    }
                }
            }
            stulist.get(i).pay=max;
        }
        for(int i=0;i<stulist.size();i++){
            System.out.println(stulist.get(i).getPay());
        }
    }
}
class Job{
     int diffcult;
     int money;
    public Job(int diffcult,int money){
        this.diffcult=diffcult;
        this.money=money;
    }
    public int getDiffcult() {
        return diffcult;
    }

    public void setDiffcult(int diffcult) {
        this.diffcult = diffcult;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
class Student{
     int strong;
    int pay;

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public Student(int strong){
        this.strong=strong;
    }
    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }
}
