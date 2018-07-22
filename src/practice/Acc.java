package practice;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/29.
 */
public class Acc {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int k=1;
        int arr[][]=new int[n+1][n+1];
        for(int i=1;i<=n/2;i++){
            for(int j=i;j<=n-i;j++){
                arr[i][j]=cin.nextInt();
                k++;
            }
            for(int j=i;j<=n-i;j++){
                arr[j][n+1-i]=cin.nextInt();
                k++;
            }
            for(int j=n-i+1;j>=i+1;j--){
                arr[n+1-i][j]=cin.nextInt();
                k++;
            }
            for(int j=n-i+1;j>=i+1;j--){
                arr[j][i]=cin.nextInt();
                k++;
            }
        }
        if(n%2==1){
            int m=(n+1)/2;
            arr[m][m]=n*n;
        }
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=n;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
