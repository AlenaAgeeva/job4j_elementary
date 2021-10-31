package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiveToTwentyFiveThenOneHundredFifty() {
        int start = 5;
        int finish = 25;
        int result = Counter.sumByEven(start, finish);
        int expected = 150;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromTenToTwentyThenOneHundredSixtyFive() {
        int start = 10;
        int finish = 20;
        int result = Counter.sum(start, finish);
        int expected = 165;
        Assert.assertEquals(expected, result);
    }
}