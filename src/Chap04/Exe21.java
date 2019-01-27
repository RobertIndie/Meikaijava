package Chap04;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("显示直角在左上方的三角形。");
        System.out.print("层数：");
        int n = stdIn.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();

        }
    }
}
