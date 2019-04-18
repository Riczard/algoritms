package com.kuklinski.quickSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSortExpectedEquals() {
        int[] arr = {3, 3, 10, 20, -2, 100, 200, 30, 33, 54, 4, 0, 2, 600, -2, 45, 0};
        int[] expectedArr = {-2, -2, 0, 0, 2, 3, 3, 4, 10, 20, 30, 33, 45, 54, 100, 200, 600};
        int[] result = QuickSort.quickSort(arr);
        assertArrayEquals(expectedArr, result);
    }
}