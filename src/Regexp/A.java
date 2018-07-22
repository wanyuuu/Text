package Regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
字符串匹配时，matches尝试将整个区域与模式匹配
find尝试查找与该模式匹配的下一个子序列
 */
public class A {
    public static void main(String[] args) {
//        String str="Hello world";
//        String reg=".*llo.*";
//        boolean isMatch= Pattern.matches(reg,str);
//        System.out.println(isMatch);
        String str1="This order was placed for QW555! OK?";
        String reg1="(\\D*)(\\d+)(.*)"; //非数字 非字母
        Pattern pattern=Pattern.compile(reg1);
        Matcher matcher=pattern.matcher(str1);
        System.out.println(matcher.groupCount());
        if(matcher.find()){
            System.out.println(matcher.group(0));//返回整个匹配的字符串
            System.out.println(matcher.group(1));//第一组匹配的字符串
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
    @Test
    public void test(){
        String r="zo*";//零次或多次匹配前面的字符
        String r1="zo+";//一次或多次匹配前面的字符
        String r2="zo?";//一次或零次匹配前面的字符 匹配次数是指o
        String r3="zo{2}";//正好匹配n次
        String r4="zo{2,}";//至少匹配n次
        String r5="o{1,3}";//至少匹配n次 至多匹配m次
        String r6="o+?";//非贪心的 只匹配一次o
        String r7="food|eat";
        String r8="[xyzabc]";//匹配包含的任一字符
        String r9="[^xyzabc]";//反向匹配
        String r10="[a-e]";//匹配指定范围内的字符
        String r11="[^a-e]";//不在指定范围内的字符
        String r12="er\\b";//匹配边界
        String r13="\\d";//匹配一个数字字符
        String r14="\\D";//非数字字符
        String s="z";
        boolean isFlag=Pattern.matches(r,s);
        System.out.println(isFlag);
        System.out.println(Pattern.matches(r1,s));
        System.out.println(Pattern.matches(r2,s));
        System.out.println(Pattern.matches(r3,"zoooo"));
        System.out.println(Pattern.matches(r4,"zoooo"));
        System.out.println(Pattern.matches(r5,"ooo"));
        System.out.println(Pattern.matches(r6,"ooooo"));
        System.out.println(Pattern.matches(r7,"food"));
        System.out.println(Pattern.matches(r8,"x"));
        System.out.println(Pattern.matches(r9,"q"));
        System.out.println(Pattern.matches(r10,"d"));
        System.out.println(Pattern.matches(r12,"never"));
        System.out.println(Pattern.matches(r14,"A"));
    }
    @Test
    public void str(){//字符串匹配
        String str="hello world!hahah";
        String reg="world!*";
        Pattern p=Pattern.compile(reg);
        Matcher m=p.matcher(str);
        System.out.println(m.find());
    }
    @Test
    public void test2(){
        String str="北京市(海淀区)(朝阳区)(西城区)";
        String matches=".*(?=\\()"; //贪婪匹配 匹配到最后一个(
        String matches1=".*?(?=\\()";//懒惰匹配 匹配到第一个(就结束
        Pattern pattern=Pattern.compile(matches1);
        Matcher matcher=pattern.matcher(str);
        if(matcher.find()) {
            System.out.println(matcher.group(0));
         //  System.out.println(matcher.group(1));
        }
        System.out.println('\\');
    }
}
