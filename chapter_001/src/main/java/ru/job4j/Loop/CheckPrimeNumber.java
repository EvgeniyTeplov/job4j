package ru.job4j.Loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number> 1;
        for(int n = 2; n < number; n++ ) {
            if ((number % n) == 0)  {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
