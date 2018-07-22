package CCF;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wanyu on 2018/4/2.
 */
public class K {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        long l=cin.nextLong();
        long r=cin.nextLong();
        long sum=0;
        long shu=0;
        long tmp=0;
        long i=1;
        for(;i<=r;i++){
          tmp=tmp%3;
            tmp=tmp+i;
            if(tmp%3==0&&i>=l){
                sum++;
            }
        }
        System.out.print(sum);
    }
}
