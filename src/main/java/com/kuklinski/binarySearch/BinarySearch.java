package com.kuklinski.binarySearch;


import java.util.NoSuchElementException;

//fast log2n
public class BinarySearch {

    //list must be sorted
    public static int binarySearch(int[] arr, int searched) {
        int low = 0;
        int high = arr.length - 1;
        int quess, mid;

        while (low <= high) {
            mid = (low + high) / 2;
            quess = arr[mid];

            if (quess == searched) {
                return mid;
            }
            if (quess < searched) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        throw new NoSuchElementException("Element not Found");
    }

}
