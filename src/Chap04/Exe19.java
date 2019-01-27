package Chap04;

import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;//要重复一次吗？
        int month;
        do {
            System.out.print("计算季节。\n请输入月份:");
            month = stdIn.nextInt();

            if (month >= 3 && month <= 5)
                System.out.println("这是春天。");
            else if (month >= 6 && month <= 8)
                System.out.println("这是夏天。");
            else if (month >= 9 && month <= 11)
                System.out.println("这是秋天。");
            else if (month == 12 || month == 1 || month == 2)
                System.out.println("这是冬天。");
            //  else if (month < 13 || month > 0)


        } while (month < 0 && month > 13);
        while (month < 13 || month > 0) {
            System.out.println("请重新输入正确的月份数字：");
            retry = stdIn.nextInt();
            month = retry;
        }
    }
}
