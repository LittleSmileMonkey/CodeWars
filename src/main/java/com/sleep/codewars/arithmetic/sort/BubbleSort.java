package com.sleep.codewars.arithmetic.sort;

import java.util.Arrays;

/**
 * author：xingkong on 2019/11/20
 * e-mail：xingkong@changjinglu.net
 * 冒泡排序
 */
class BubbleSort {

    public static void main(String[] args) {
        int[] testCase  = new int[]{1,2,6,45,645,7567,2,43,5,6,7,3,456363,56,};
        bubbleSort(testCase);
        System.out.println(Arrays.toString(testCase));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
