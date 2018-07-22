package practice;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/29.
 */
public class Bbb {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = cin.nextInt();
            }
        }
        int flag = 1;
        int x = 0, y = -1;
        for (int i = n, j = n - 1; j >= 0; i--, j--) {
            for (int k = i; k > 0; k--) {
                y += flag;
                if (x == 0 && y == 0){
                    System.out.print(arr[0][0]);
                }
                else {
                    System.out.print("," + arr[x][y]);
                }
            }
            for (int k = j; k > 0; k--) {
                x += flag;
                System.out.print("," + arr[x][y]);
            }
            flag = -flag;
        }


    }
}
