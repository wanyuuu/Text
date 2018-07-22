package CCF;

import java.util.*;

/**
 * Created by wanyu on 2018/3/12.
 */
public class C {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        for(int i=0;i<n;i++){
            int m=cin.nextInt();
            int a[]=new int[m];
            for(int j=0;j<m;j++){
                a[j]=cin.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
    public void test(){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        for(int i=0;i<n;i++){
            int m=cin.nextInt();
            int a[]=new int[m];
            for(int j=0;j<m;j++){
                a[j]=cin.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
}
