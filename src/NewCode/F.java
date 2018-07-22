package NewCode;

import java.util.Scanner;

/*
给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
 */
public class F {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        StringBuffer str=new StringBuffer();
        str.append(cin.nextLine());
        char arr[]= str.toString().trim().toCharArray();
        int zimu[]=new int[127];
        for (char c:arr) {
            zimu[c]++;//用来计算每个字母的数量
            if((c>='a'&&c<='z'||c>='A'&&c<='Z')&&zimu[c]==3){
                System.out.println(c);
                break;
            }
        }
    }
}
