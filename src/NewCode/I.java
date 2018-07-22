package NewCode;

import java.math.BigInteger;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        BigInteger a=cin.nextBigInteger();//大数操作 以字符串形式输入
        BigInteger b=cin.nextBigInteger();
        try{
            System.out.print(a.add(b));
        }catch (Exception e){
            System.out.print("error");
        }
    }
}
