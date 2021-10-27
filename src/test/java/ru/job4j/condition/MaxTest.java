package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax20To12Then20() {
        int left = 20;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax67To78Then78() {
        int left = 67;
        int right = 78;
        int result = Max.max(left, right);
        int expected = 78;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9To9Then9() {
        int left = 9;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}