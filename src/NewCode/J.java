package NewCode;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class J {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String tmp = "";
        while (scn.hasNext()) {
            tmp = scn.nextLine();
            for (String i : tmp.split(" ")) {
                set.add(i);
            }
        }
        System.out.println(set.size());
    }
}
