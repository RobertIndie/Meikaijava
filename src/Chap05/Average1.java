package Chap05;

import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("计算整数值x和y的平均值。");
        System.out.print("x的值：");
        int x = stdIn.nextInt();
        System.out.print("y的值：");
        int y = stdIn.nextInt();
        double ave = (x + y) / 2;//平均值--因为（x+y）/2的值是舍弃小数部分的整数，虽然ave是double类型，但是原始数据没有小数部分，使用ave也就没有小数部分
        System.out.println("x和y的平均值为" + ave + "。");
    }
}
