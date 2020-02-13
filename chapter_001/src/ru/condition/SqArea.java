package ru.job4j.condition;

public class SqArea {
    public static double squarea(int p, int k) {
        //int h = (p / k - k);
        //int l = h * k;
       // int s = l * h;
        int h = p / (2* (k + 1));
        int l = h * k;
        int s = l * h;

        return s;
    }
    public static void main(String[] args) {
        double result1 = squarea(6,2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);

        double result2 = squarea(4,1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result2);
    }
}
