package NewCode;

import java.util.Scanner;

/*
给定一个句子（只包含字母和空格）， 将句子中的单词位置反转，单词用空格分割,
单词之间只有一个空格，前后没有空格。 比如： （1） “hello xiao mi”-> “mi xiao hello”
 */
public class D {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            String str=cin.nextLine();//取整行 不受空格影响
            reverse(str);
        }
    }
    static void reverse(String str){
        String arr[]=str.split(" ");
        for(int i=arr.length-1;i>=1;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[0]);
    }
}
