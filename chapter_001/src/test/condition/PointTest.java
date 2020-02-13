package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;


public class PointTest {

    @Test
    public void distance(){
        int in1 = 10;
        int in2 = 5;
        int in3 = 2;
        int in4 = 1;
        double expected = 9;
        double out = Point.distance(in1,in2,in3,in4);
        Assert.assertEquals(expected, out, 0.05);
    }
}
