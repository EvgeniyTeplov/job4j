package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
        //return value * 70;
    }
    @Test
    public void rubleToDollar() {
        int in =180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void EuroToRuble() {
        int in = 7;
        int expected = 490;
        int out = Converter.EuroToruble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void DollarToRuble() {
        int in = 10;
        int expected = 600;
        int out = Converter.DollarToruble(in);
        Assert.assertEquals(expected, out);
    }
}
