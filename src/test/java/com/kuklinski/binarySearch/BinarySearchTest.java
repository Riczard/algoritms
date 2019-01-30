package com.kuklinski.binarySearch;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

import java.util.NoSuchElementException;

public class BinarySearchTest {

    @Test
    public void testBinarySearchWhenItemIsInListExpected1() {
        int[] sortedArr = {1, 3, 5, 7, 9};
        int expected = 1;
        int result = BinarySearch.binarySearch(sortedArr, 3);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchWhenItemIsInListExpected8() {
        int[] sortedArr = {1, 3, 5, 7, 9, 20, 22, 40, 50, 100, 200, 210, 300, 500, 800};
        int expected = 8;
        int result = BinarySearch.binarySearch(sortedArr, 50);
        assertEquals(expected, result);
    }

    @Test(expected = NoSuchElementException.class)
    public void testBinarySearchWhenItemIsNotInListExpectedNoSuchElementException() {
        int[] sortedArr = {1, 3, 5, 7, 9, 20, 22, 40, 100, 200, 210, 300, 500, 800};
        BinarySearch.binarySearch(sortedArr, 50);

    }

}