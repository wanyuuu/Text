package CCF;

import java.util.Scanner;

public class B {//约瑟夫小朋友报数 k的倍数或数的个位为k淘汰

    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int n=cin.nextInt();//孩子人数
        int k=cin.nextInt();//报数点
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=1;//孩子都在圈里
        }
        int m=n;
        int a=1;//记录报数
        while(m>1){//记录圈里人数‘
            int z=0;//记录出圈人数
            for(int i=1;i<=n;i++){
               if(arr[i]==1) {//有人的位置才报数
                   if (a % k == 0 || a % 10 == k) {
                       arr[i] = 0;//代表出圈
                       z++;
                   }
                   a++;//报数+1
               }
            }
            m=m-z;//圈内还剩余人数
        }
        for(int i=1;i<=n;i++){
            if(arr[i]==1){
                System.out.print(i);
            }
        }
    }
}
