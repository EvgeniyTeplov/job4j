package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(0, 1);
        assertThat(result, is(1));
    }
    @Test
    public void NOMAX(){
        int result = Max.max(1,1);
        assertThat(result, is(1));
    }
    @Test
    public void MaxToMax(){
        int result = Max.max(10, 1);
        assertThat(result, is(10));
    }
}
