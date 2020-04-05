package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.Loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumAllNumbersFromOneToTenThenFiftyFive() {
        int rsl = Counter.sum(1, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }
}
