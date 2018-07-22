package NewCode;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/19.
 */
public class K {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String str=cin.nextLine();
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            int k=a[i];
            char b=1;
            if((k>=65&&k<=90)||(k>=97&&k<=122)){
                 b=(char)(++k);
                System.out.print(b);
            }else {
                System.out.print(a[i]);
            }

        }

    }
}
