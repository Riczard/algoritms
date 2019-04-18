package com.kuklinski.selectSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// logarithm speed  O(n^2)
public class SelectSort {

    public static int[] selectSort(Integer[] arr) {
        Integer smallestNum;
        int[] newArr = new int[arr.length];
        ArrayList<Integer> arrAsList =new ArrayList<>( Arrays.asList(arr));

        for (int i = 0; i < arr.length; i++) {
            smallestNum = findSmallestNumIndex(arrAsList);
            newArr[i] = smallestNum;
            arrAsList.remove(smallestNum);
        }
        return newArr;
    }

    private static int findSmallestNumIndex(List<Integer> arr) {
        return arr.stream().mapToInt(value -> value).min().getAsInt();
    }
}
