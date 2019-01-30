package Chap05.Exe;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("变量x为float型，变量y为double型。");

        System.out.print("x:");
        float a = stdIn.nextFloat();

        System.out.print("y:");
        Double b = stdIn.nextDouble();

        System.out.println("x="+a);
        System.out.println("y="+b);
    }

}
