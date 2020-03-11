package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void sqarea() {
        int p = 4;
        int k = 1;
        int expected = 1;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected,out, 0.01);
    }
}
