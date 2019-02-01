package Chap06.Exe;

public class Exe1 {
    public static void main(String[] args) {
        Double[] a = new Double[5];//数组声明
        a[1] = 37.0;           //把37赋给a[1]
        a[2] = 51.0;           //把51赋给a[2]
        a[4] = a[1] * 3;     //把74赋给a[4]

        //显示全部元素的值
        System.out.println("a[" + 0 + "]=" + a[0]);
        System.out.println("a[" + 1 + "]=" + a[1]);
        System.out.println("a[" + 2 + "]=" + a[2]);
        System.out.println("a[" + 3 + "]=" + a[3]);
        System.out.println("a[" + 4 + "]=" + a[4]);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("a[" + i+ "]=" + a[i]);
        }
    }
}
