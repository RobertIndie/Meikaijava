package Chap05.Exe;

public class Exe6 {
    public static void main(String[] args) {
        float n;
        int i = 0;

        System.out.println("   float              int");
        System.out.println("----------------------------");

        while (i <= 1000) {
            float x = (float) i / 1000;
            x += x;
            float x1 = 0.0F;
            x1 += 0.001F;
            System.out.printf("%f       %f\n", x, x1);
        }

    }
}
