package CCF;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/12.
 */
public class D {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        for(int i=0;i<t;i++){
            int x=cin.nextInt();
            int sum=0;
            int m=1;
            while(sum<x){
                sum=sum+m*m*m;
                m++;
            }
            System.out.println(m-1);
        }
    }
}
