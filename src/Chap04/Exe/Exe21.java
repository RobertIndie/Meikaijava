package Chap04.Exe;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //System.out.println("显示直角在左上方的三角形。");
        System.out.print("层数：");
        int n = stdIn.nextInt();
        //左上角
        System.out.println("显示直角在左上方的三角形。");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();

        }
        //右下角
        System.out.println("显示直角在右下角的三角形。");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(' ');
            for (int k = 1; k <= i; k++)
                System.out.print('*');
            System.out.println();
        }
        //右上角
        System.out.println("显示直角在右上角的三角形。");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++)
                System.out.print(' ');
            for (int k = 1; k <= n - i + 1; k++)
                System.out.print('*');
            System.out.println();
        }
    }
}
