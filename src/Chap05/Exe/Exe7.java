package Chap05.Exe;

public class Exe7 {
    public static void main(String[] args) {
        float sum = 0.0F;

        for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
            float x1 = x * x;
            System.out.printf("%d       %d", x, x1);
            System.out.println();
        }
    }
}
