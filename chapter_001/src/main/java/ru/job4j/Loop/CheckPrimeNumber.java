package ru.job4j.Loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for(int n = 2; n <= number; n++ ) {
            if ((number % n) != 0 && number % 1 == 0)  {
                prime = true;
            }
            break;
        }
        return prime;
    }
}
