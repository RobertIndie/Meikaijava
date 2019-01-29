package Chap04;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        a:{
            System.out.print("负整数：");
            int t = stdIn.nextInt();
            if (t>=0) break a;
            t = -t;
            System.out.println("绝对值是" + t + "。");
        }
    }
}
