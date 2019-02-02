package Chap06.Exe;

import java.util.Random;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + rand.nextInt(10);
        // 输出12行
        // *
        // -
        // 0
        for (int i = 0; i <= 12; i++) {
            if (i <= 10) {
                for (int j = 0; j < n; j++)
                    System.out.print((i > (10 - a[j])) ? "* " : "  ");
                System.out.println();
            } else if (i == 11) {
                for (int k = 0; k <= 2 * n - 2; k++)
                    System.out.print("-");
                System.out.println();
            } else {
                for (int x = 0, l = 1; l <= 2 * n - 1; l++) {

                    if (l % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print(x % 10);
                        x++;
                    }

                }
            }
        }
    }
}
