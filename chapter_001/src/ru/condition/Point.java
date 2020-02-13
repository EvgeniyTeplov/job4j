package ru.job4j.condition;

import static java.lang.StrictMath.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;

        double first = Math.pow(x, 2);
        double first1 = Math.pow(y, 2);

        double result = first + first1;
        double R = Math.sqrt(result);
        return R;
    }

    public static void main(String[] args) {
        double result = distance(2,2,4,4);
        System.out.println("result (2, 2) to (4, 4) " + result);

        double result1 = distance(4,4,10,10);
        System.out.println("result1 (4, 4) to (10, 10) " + result1);

        double result2 = distance(6,6,10,10);
        System.out.println("result1 (4, 4) to (10, 10) " + result2);

    }
}


