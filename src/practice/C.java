package practice;

import java.util.ArrayList;
import java.util.List;

public class C {
    private List names=new ArrayList();
    public synchronized void add(String name){
        names.add(name);
    }
    public synchronized void printAll(){
        for(int i=0;i<names.size();i++){
            System.out.print(names.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        final C c=new C();
        for(int i=0;i<2;i++){
            new Thread(){
                public void run(){
                    c.add("A");// A A B B C C 交替进入 输出AABBCCAABBCC
                    c.add("B");//A B C A B C顺序进入输出ABCABCABC
                    c.add("C");
                    c.printAll();
                }
            }.start();
        }
    }
}
