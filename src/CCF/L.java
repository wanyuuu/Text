package CCF;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/4/2.
 */
public class L {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();//零食的数量
        int w=cin.nextInt();//背包容量
        int v[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            v[i]=cin.nextInt();
            sum+=v[i];
        }
        if(sum<=w){
            System.out.print(Math.pow(2,n));
        }
    }
}
