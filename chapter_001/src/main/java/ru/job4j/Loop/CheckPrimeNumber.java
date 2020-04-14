package ru.job4j.Loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for(int n = 1; n <= number; n++ ) {
            if ((number % 2) != 0 && number % n == 0)  {
                break;
            }
            else prime = false;
            break;
        }
        return prime;
    }
}
