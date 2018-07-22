package CCF;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/27.
 */
public class I {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int k=cin.nextInt();
        int x=0,y=0;
        int z=0;
        int sum=0;
        for(x=1;x<=n;x++){
            for(y=1;y<=n;y++){
                z=x%y;
                if(z>=k){
                    sum++;
            }
        }
    }
        System.out.print(sum);
}
}
