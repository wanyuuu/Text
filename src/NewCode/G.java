package NewCode;

import java.util.Scanner;

/*
王后很喜欢红宝石，蓝宝石，紫水晶，翡翠和钻石这五种，我要你从项链中截取连续的一小段还给我，这一段中必须包含所有的这五种宝石，剩下的部分你可以带走。如果无法找到则一个也无法带走。请帮助学者找出如何切分项链才能够拿到最多的宝石。
我们用每种字符代表一种宝石，A表示红宝石，B表示蓝宝石，C代表紫水晶，D代表翡翠，E代表钻石，F代表玉石，G代表玻璃等等，我们用一个全部为大写字母的字符序列表示项链的宝石序列，注意项链是首尾相接的。每行代表一种情况。
 */
public class G {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            String str=cin.next();
            int length=str.length();
            StringBuffer sb=new StringBuffer(str);
            if(sb.indexOf("A")==-1||sb.indexOf("B")==-1||sb.indexOf("C")==-1||
                    sb.indexOf("D")==-1||sb.indexOf("E")==-1){
                System.out.println(0);
            }

        }
    }
}
