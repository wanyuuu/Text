package CCF;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/12.
 */
public class E {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        for(int i=0;i<t;i++){
            float f=cin.nextFloat();
            String ff=f+"";
            int n=cin.nextInt();
            int s=ff.indexOf(".");
            if(n+s+1>ff.length()){
                System.out.println(0);
            }else {
                System.out.println(ff.substring(s + n, s + n + 1));
            }
        }
    }
}
