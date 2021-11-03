package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = {3, -2, 76};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-2, 3, 76};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = {67, 4, 0, 98, 34};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 4, 34, 67, 98};
        Assert.assertArrayEquals(expected, result);
    }
}