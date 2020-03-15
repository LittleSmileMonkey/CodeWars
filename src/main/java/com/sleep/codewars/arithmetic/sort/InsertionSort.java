package com.sleep.codewars.arithmetic.sort;

import java.util.Arrays;

/**
 * author：xingkong on 2020/3/11
 * e-mail：xingkong@changjinglu.net
 */
class InsertionSort {

    public static void main(String[] args) {
        int[] testCase = new int[]{1, 2, 6, 45, 645, 7567, 2, 43, 5, 6, 7, 3, 456363, 56,};
        insertionSort(testCase);
        System.out.println(Arrays.toString(testCase));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1, j, current; i < array.length; i++) {
            current = array[i];
            for (j = i - 1; j >= 0 && array[j] > current; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = current;
        }
    }
}
