package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10,4,2);
        assertThat(result, is(10));
    }
    @Test
    public void whenSecondMax1() {
        MultiMax check = new MultiMax();
        int result = check.max(99,5,101);
        assertThat(result, is(101));
    }
    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(2,4,99);
        assertThat(result, is(99));
    }
    @Test
    public void whenSecondMax3() {
        MultiMax check = new MultiMax();
        int result = check.max(6,6,6);
        assertThat(result, is(6));
    }
}
