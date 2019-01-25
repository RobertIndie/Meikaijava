package Chap04;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要显示多少个呢：");
        int n = stdIn.nextInt();

        int i = 1;
        while (n > 0) {
            System.out.print((n % 2 == 0) ? "*" : "+");
            n--;
        }
        System.out.println();
    }
}
