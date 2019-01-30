package Chap04;

import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;
        //do语句
        do {
            System.out.print("正整数：");
            x = stdIn.nextInt();
        } while (x <= 0);
        int y = x;
        int z = x;
        //while语句
        while (y >= 0)
            System.out.printf("%5d%5d\n", y--, ++z);
            System.out.println("长宽为整数、面积为" + x + "的长方形的长和宽为：");
        for (int i = 1; i < x; i++) {
            if (i * i > x) break;
            if (x % i != 0) continue;
            System.out.printf("%d X %d\n", i, x / i);
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}