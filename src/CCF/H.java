package CCF;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/17.
 * 购票系统
 */
public class H {
    static int stu[] = new int[101];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int piao[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            piao[i] = cin.nextInt();
        }
        for (int a = 1; a <= n; a++) {
            int sum = piao[a];//获取票数
            boolean flag = false;
            for (int i = 0; i < 20; i++) {//每行
                for (int j = 1; j <= 5; j++) {  //每列
                    if (stu[i * 5 + j] == 0 && j + sum <=6) {//可以订票
                        for (int k = i * 5 + j; k < i * 5 + j + sum; k++) {
                            stu[k] = i+1;
                        }
                        flag = true;//定完票
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
        }
        for(int i=0;i<20;i++){
            for(int j=1;j<=5;j++){
                if(stu[i*5+j]!=0){
                    System.out.print(stu[i*5+j]+" ");
                }

            }
        }
    }
}
