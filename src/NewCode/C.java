package NewCode;

import java.util.Scanner;

/*
继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：
首先将电话号码中的每个数字加上8取个位，然后使用对应的大写字母代替
4（"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"），
 然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
输入描述:
第一行是一个整数T（1 ≤ T ≤ 100)表示测试样例数；接下来T行，每行给定一个分身后的电话号码的分身（长度在3到10000之间）。
输出描述:
输出T行，分别对应输入中每行字符串对应的分身前的最小电话号码（允许前导0）。
输入
4
EIGHT
ZEROTWOONE
OHWETENRTEO
OHEWTIEGTHENRTEO
输出
0
234
345
0345
 */
public class C {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        int k=0;
        while(k++<t){
            String str=cin.next();//zero one two three four five six seven eight nine
            dealStr(str);
        }
    }
   static public void dealStr(String str){
        str=str.toLowerCase();
        StringBuffer sb=new StringBuffer(str);
        int arr[]=new int[10];//用来存储电话号码
        while(sb.indexOf("z")!=-1){//zero
            arr[2]++;
            sb.deleteCharAt(sb.indexOf("z"));
            sb.deleteCharAt(sb.indexOf("e"));
            sb.deleteCharAt(sb.indexOf("r"));
            sb.deleteCharAt(sb.indexOf("o"));
        }
        while(sb.indexOf("w")!=-1){//two
            arr[4]++;
            sb.deleteCharAt(sb.indexOf("w"));
            sb.deleteCharAt(sb.indexOf("t"));
            sb.deleteCharAt(sb.indexOf("o"));
        }
        while(sb.indexOf("u")!=-1){//four
            arr[6]++;
            sb.deleteCharAt(sb.indexOf("u"));
            sb.deleteCharAt(sb.indexOf("f"));
            sb.deleteCharAt(sb.indexOf("o"));
            sb.deleteCharAt(sb.indexOf("r"));
        }
        while(sb.indexOf("x")!=-1){//six
            arr[8]++;
            sb.deleteCharAt(sb.indexOf("x"));
            sb.deleteCharAt(sb.indexOf("s"));
            sb.deleteCharAt(sb.indexOf("i"));
        }
        while(sb.indexOf("g")!=-1){//eight
            arr[0]++;
            sb.deleteCharAt(sb.indexOf("g"));
            sb.deleteCharAt(sb.indexOf("e"));
            sb.deleteCharAt(sb.indexOf("i"));
            sb.deleteCharAt(sb.indexOf("h"));
            sb.deleteCharAt(sb.indexOf("t"));
        }
        while(sb.indexOf("o")!=-1){//one
            arr[3]++;
            sb.deleteCharAt(sb.indexOf("o"));
            sb.deleteCharAt(sb.indexOf("n"));
            sb.deleteCharAt(sb.indexOf("e"));
        }
        while(sb.indexOf("t")!=-1){//three
            arr[5]++;
            sb.deleteCharAt(sb.indexOf("t"));
            sb.deleteCharAt(sb.indexOf("h"));
            sb.deleteCharAt(sb.indexOf("r"));
            sb.deleteCharAt(sb.indexOf("e"));
            sb.deleteCharAt(sb.indexOf("e"));
        }
        while(sb.indexOf("f")!=-1){//five
            arr[7]++;
            sb.deleteCharAt(sb.indexOf("f"));
            sb.deleteCharAt(sb.indexOf("i"));
            sb.deleteCharAt(sb.indexOf("v"));
            sb.deleteCharAt(sb.indexOf("e"));
        }
        while(sb.indexOf("s")!=-1){//seven
            arr[9]++;
            sb.deleteCharAt(sb.indexOf("s"));
            sb.deleteCharAt(sb.indexOf("e"));
            sb.deleteCharAt(sb.indexOf("v"));
            sb.deleteCharAt(sb.indexOf("e"));
            sb.deleteCharAt(sb.indexOf("n"));
        }
        while(sb.indexOf("n")!=-1){
            arr[1]++;
            sb.deleteCharAt(sb.indexOf("n"));
            sb.deleteCharAt(sb.indexOf("i"));
            sb.deleteCharAt(sb.indexOf("n"));
            sb.deleteCharAt(sb.indexOf("e"));
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<arr[i];j++){ //每个电话号码的个数
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
