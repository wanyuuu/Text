package CCF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A {//n个数中差值最小的两个数 输出差值
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=cin.nextInt();
        }
        int min=Math.abs(arr[0]-arr[1]);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(min>Math.abs(arr[i]-arr[j])){
                    min=Math.abs(arr[i]-arr[j]);
                }
            }
        }
        System.out.print(min);
    }
}
