package Chap05.Exe;

public class Exe7 {
    public static void main(String[] args) {
        float n;
        int i = 0;

        System.out.println("x                x的平方");
        System.out.println("--------------------------");
        while (i <= 1000) {
            n = (float) i / 1000;
            System.out.printf("%1.7f        %1.7f\n", n, n * n);
            i++;
        }

    }
}
