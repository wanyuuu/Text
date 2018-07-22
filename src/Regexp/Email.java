package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String em1="wanyu2017@163.com";
        String em2="751886087@qq.com";
        String reg1="[a-zA-Z0-9_-]+@[a-zA-Z0-9]+(.[a-zA-Z0-9]+)";
       Pattern p=Pattern.compile(reg1);
        Matcher m=p.matcher(em2);
        System.out.println(m.matches());
        System.out.println(Pattern.matches(reg1,em1));
    }
}
