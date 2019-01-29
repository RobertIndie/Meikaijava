package Chap03.Exe;

import java.util.Scanner;

public class Text9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();

        System.out.print("整数b：");
        int b = stdIn.nextInt();

        int max = a > b ? a : b;//较大的值
        System.out.println("较大的值是" + max + "。");

    }
}
