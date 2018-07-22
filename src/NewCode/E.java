package NewCode;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
  平方数 取前m项和
 */
public class E {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.00");//保留两位小数
        while(cin.hasNext()){
            double n=cin.nextInt();
            double m=cin.nextInt();
            double sum=0;
            for(int i=0;i<m;i++){
                sum+=n;
                n=Math.sqrt(n);
            }
            System.out.println(df.format(sum));
        }
    }
}
