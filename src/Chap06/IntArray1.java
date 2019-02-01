package Chap06;

public class IntArray1 {
    public static void main(String[] args) {
        int[] a = new int[5];//数组声明
        a[1] = 37;           //把37赋给a[1]
        a[2] = 51;           //把51赋给a[2]
        a[4] = a[1] * 2;     //把74赋给a[4]

        //显示全部元素的值
        System.out.println("a[" + 0 + "]=" + a[0]);
        System.out.println("a[" + 1 + "]=" + a[1]);
        System.out.println("a[" + 2 + "]=" + a[2]);
        System.out.println("a[" + 3 + "]=" + a[3]);
        System.out.println("a[" + 4 + "]=" + a[4]);
    }
}
