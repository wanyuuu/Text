package NewCode;

import java.util.Scanner;

/*
春天是鲜花的季节，水仙花就是其中最迷人的代表，
数学上有个水仙花数，他是这样定义的： “水仙花数”是指一个三位数，
它的各位数字的立方和等于其本身，
比如：153=1^3+5^3+3^3。 现在要求输出所有在m和n范围内的水仙花数。
 */
public class B {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a,b,c;
        while(cin.hasNext()){
            int m=cin.nextInt();
            int n=cin.nextInt();
            boolean flag=false;
            int k=0;
            int arr[]=new int[100];
            for(int i=m;i<=n;i++){
                a=i/100;
                b=i/10%10;
                c=i%10;
                if(a*a*a+b*b*b+c*c*c==i){
                   arr[k++]=i;
                    flag=true;
                }
            }
            if(flag==false){
                System.out.println("no");
                continue;
            }
            for(int i=0;i<k-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[k-1]);
        }
    }
}
