package NewCode;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/4/9.
 * 京东 拆分数字  输入N ，i*j=N ,i是奇数，j是偶数，输出j最小时的 i,j；若没有则输出No.
 */
public class M {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        for(int i=0;i<t;i++){
            long n=cin.nextLong();
            if(n%2==1){
                System.out.println("No");
            }else {
                long x=n/2;
                long y=2;
                while(x%2==0){
                    x=x/2;
                    y*=2;
                }
                System.out.println(x+" "+y);
            }
        }
    }
}
