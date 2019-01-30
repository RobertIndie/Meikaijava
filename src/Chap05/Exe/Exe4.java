package Chap05.Exe;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("计算整数x、y和z的平均值。");
        System.out.print("x的值：");
        int x = stdIn.nextInt();
        System.out.print("y的值：");
        int y = stdIn.nextInt();
        System.out.print("z的值：");
        int z = stdIn.nextInt();

        double ave = (x + y + z) / 3.0;
        System.out.println("x、y和z的平均值为 " + ave + "。");
    }
}
