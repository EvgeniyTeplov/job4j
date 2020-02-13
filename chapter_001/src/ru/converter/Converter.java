package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int EuroToruble(int value) {
        return value * 70;
    }
    public static int DollarToruble(int value) {
        return value * 60;
    }

    public static void main(String[] args ) {
        int euro = rubleToEuro(140);
        System.out.println(" 140 rubles are " + euro + " euro ");
        int dollar = rubleToDollar(120);
        System.out.println(" 120 rubles are " + dollar + " dollar ");
        int rubl = DollarToruble(2);
        System.out.println(" 2 dollar are " + rubl + " rubl ");
        int rubll = EuroToruble(2);
        System.out.println(" 2 euro are " + rubll + " rubl ");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are 2. Test result : " + passed1);

        int in2 = 4;
        int expected2 = 280;
        int out2 = EuroToruble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("4 euro are 240. Test result : " + passed2);

        int in3 = 4;
        int expected3 = 240;
        int out3 = DollarToruble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("4 dollar are 240. Test result : " + passed3);
    }
}

