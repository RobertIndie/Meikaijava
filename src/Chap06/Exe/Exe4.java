package Chap06.Exe;

import java.util.Random;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int b = stdIn.nextInt();
        int y;
        int[] a = new int[b];

        for (int i = 0; i < b; i++){
            a[i] = rand.nextInt(10);

            for (int m = 1; m <a[i]; m++) {
                   System.out.print(' ');
                for (int n  = 1; n<a[i]; n++)
                    System.out.print(" *");
            }
    }
        System.out.println("-----------------------");
        for (int x=1;x<b;x++) {
            y = x / 10;
            System.out.print(y);
        }
    }
}
