package CCF;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/17.
 * 学生排队
 */
public class G {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt(); //n个同学
        int m=cin.nextInt();
        int stu[]=new int[n+1];
        for(int i=1;i<=n;i++){
            stu[i]=i; //初始化
        }
        for(int i=0;i<m;i++){
            int p=cin.nextInt();//p号同学
            int q=cin.nextInt();//移动q
            int index=0;
            int tmp=0;
           for(int j=1;j<=n;j++){
               if(p==stu[j]){
                   index=p; //找到学生学号
                   tmp=j;  //该学号的位置
                   break;
               }
           }
            int j=0;
            if(q>0){
                for( j=tmp;j<tmp+q;j++){
                    stu[j]=stu[j+1];
                }
            }else {
                for( j=tmp;j>tmp+q;j--){
                    stu[j]=stu[j-1];
                }
            }
            stu[j]=index;
        }
        for(int i=1;i<=n;i++){
            System.out.print(stu[i]+" ");
        }
    }
}
