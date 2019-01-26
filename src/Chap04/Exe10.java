package Chap04;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要显示多少个*呢：");
        int n = stdIn.nextInt();
        int a=1;

        for (int i = 0; i < n; i++)
            System.out.print('*');
            a++;
    }
}
