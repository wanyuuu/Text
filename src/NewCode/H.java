package NewCode;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String url=cin.nextLine();
        int s=url.lastIndexOf(".");
        String name=url.substring(s+1,url.length());
        if(s==-1){
            System.out.print("null");
        }else {
            System.out.print(name);
        }

    }
}
