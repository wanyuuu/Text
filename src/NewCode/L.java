package NewCode;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/19.
 */
public class L {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();//硬币数量
        int s=cin.nextInt();//车费
        int corn[]=new int[n+1];
        for(int i=1;i<=n;i++){
            corn[i]=cin.nextInt();
        }
        for(int i=1;i<n;i++){
            int min=i;
            for(int j=i+1;j<=n;j++){
                if(corn[min]>corn[j]){
                    min=j;
                }
                }
            if(min!=i){
                int tmp=corn[min];
                corn[min]=corn[i];
                corn[i]=tmp;
            }
        }
        int sum=0;
        int i=0;
        boolean flag=false;
        for( i=1;i<=n;i++){
            sum+=corn[i];
            if(sum==s){
                break;
            }else if(sum>s){
                flag=true;
                break;
            }
        }
        if(flag){
            int shu=0;
            for(int j=n;j>=1;j--){
                if(sum-corn[j]>=s){
                    sum-=corn[j];
                    shu++;
                }
            }
            i=i-shu;
        }
        System.out.println(i);
    }
}
