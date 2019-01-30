package Chap05.Exe;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int a=stdIn.nextInt();
        System.out.print("用八进制数表示为");
        System.out.printf("%o\n", a);
        System.out.print("用十六进制数表示为");
        System.out.printf("%x\n", a);
    }
}
