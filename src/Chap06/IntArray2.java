package Chap06;

public class IntArray2 {
    public static void main(String[] args) {
        int[] a = new int[5];//数组声明

        for (int i = 0; i < a.length; i++)
            a[i] = i + 1;

        //显示全部元素的值
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i+ "]=" + a[i]);

    }
}
