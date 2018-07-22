package Regexp;

import java.util.regex.Pattern;

public class Qnum {
    public static void main(String[] args) {
        String num="751886087";
        String num1="1215050456";
        String reg="^[1-9][0-9]{5,10}$";
        System.out.println(Pattern.matches(reg,num));
        System.out.println(Pattern.matches(reg,num1));
    }
}
