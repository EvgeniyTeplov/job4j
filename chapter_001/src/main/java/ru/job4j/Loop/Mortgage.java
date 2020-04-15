package ru.job4j.Loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double balance = 0;
        percent = percent /100;
        balance = amount + amount * percent;
        while (balance > 0 ) {
                balance = balance - salary;
                balance += balance * percent;
                year++;


    }
        return year;
    }
}
