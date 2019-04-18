package com.kuklinski.quickSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

//logarithm speed  O(n log n)
public class QuickSort {

    public static int[] quickSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int randomNumberInArrRange = ThreadLocalRandom.current().nextInt(0, arr.length);

        int pivot = arr[randomNumberInArrRange];

        int[] less = new int[0];
        int[] greater = new int[0];

        for (int i = 0; i < randomNumberInArrRange; i++) {
            if (arr[i] <= pivot) {
                less = addNewElement(less, arr[i]);
            } else greater = addNewElement(greater, arr[i]);
        }

        for (int i = randomNumberInArrRange + 1; i < arr.length; i++) {
            if (arr[i] <= pivot) {
                less = addNewElement(less, arr[i]);
            } else greater = addNewElement(greater, arr[i]);
        }

        return joinArraysAndPivot(quickSort(less), pivot, quickSort(greater));
    }

    private static int[] addNewElement(int[] arr, int number) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = number;
        return newArr;
    }

    private static int[] joinArraysAndPivot(int[] arr1, int pivot, int[] arr2) {
        int[] arr = addNewElement(arr1, pivot);
        int[] resultArr = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, resultArr, 0, arr.length);
        System.arraycopy(arr2, 0, resultArr, arr.length, arr2.length);

        return resultArr;
    }
}
