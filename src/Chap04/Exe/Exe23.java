package Chap04.Exe;

import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入金字塔层数：");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {

            drawChar(n - i, " ");
            drawChar((i - 1) * 2,String.valueOf(i%10));
            drawChar(n - i, " ");
            System.out.println();
        }
    }

    private static void drawChar(int v, String c) {
        for (int j = 1; j <= v + 1; j++) {
            System.out.print(c);
        }
    }
}
