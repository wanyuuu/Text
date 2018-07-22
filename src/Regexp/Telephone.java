package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephone {
    public static void main(String[] args) {
        String tel="18845041227";
        String reg="^1[0-9]{10}$";//没啥要求的手机号
        String reg1="1[3|5|8][0-9]\\d{8}";//1 3|5|8 xxxxxxxxx
        Pattern p= Pattern.compile(reg1);
        Matcher m=p.matcher(tel);
        System.out.println(m.matches());
    }
}
