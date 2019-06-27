package com.manjula.java;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    private static void print2largest(int arr[], int arr_size) {
        int i, first, second;

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is higher than first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            /* If arr[i] is in between first and second then update second  */
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("The second largest element" + " is " + second);
    }

    private static void findSecondLargest(List<Integer> numbers) {
        int first, second;
        first = second = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second) {
                second = number;
            }
        }
        System.out.println("Largest Number: " + first);
        System.out.println("Second Largest Number: " + second);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 50, 40 };
        int n = arr.length;
        print2largest(arr, n);

        findSecondLargest(Arrays.asList(14, 46, 47, 86, 92, 52, 48, 36, 66, 85));
    }

}
