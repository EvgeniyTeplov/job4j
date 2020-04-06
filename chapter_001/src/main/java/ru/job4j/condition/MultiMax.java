package ru.job4j.condition;

public class MultiMax {
    public int max (int first, int second, int third) {


        int resullt = first > second ? first : second;

        resullt = resullt > third ? resullt : third;

        return resullt;

    }

    }

