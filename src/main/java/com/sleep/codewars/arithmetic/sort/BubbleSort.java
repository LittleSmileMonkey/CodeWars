package com.sleep.codewars.arithmetic.sort;

import java.util.Arrays;

/**
 * author：xingkong on 2019/11/20
 * e-mail：xingkong@changjinglu.net
 * 冒泡排序
 * 空间复杂度：O(1).因为是直接在数组array内部进行交换，至产生了temp临时变量，所附空间复杂度为 O(1)
 * 时间复杂度：
 * 最优情况，数组已经排好序，只需要进行n-1次比较，则复杂度为O(n)
 * 最差情况，数组完全逆序，需要进行n(n-1)/2次比较，则复杂度为O(n^2)
 * 平均情况，数组杂乱无章，需进行n(n-1)/2次比较，复杂度为O(n^2)
 */
class BubbleSort {

    public static void main(String[] args) {
        int[] testCase = new int[]{1, 2, 6, 45, 645, 7567, 2, 43, 5, 6, 7, 3, 456363, 56,};
        bubbleSort2(testCase);
        System.out.println(Arrays.toString(testCase));
    }

    private static void bubbleSort(int[] array) {
        boolean hasChange = true;
        for (int i = 0; i < array.length - 1 && hasChange; i++) {
            hasChange = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    hasChange = true;
                }
            }
        }
    }

    private static void bubbleSort2(int[] array) {
        if (array == null || array.length < 2) return;
        boolean hasChange = true;
        for (int i = 0; i < array.length - 1 && hasChange; i++) {
            hasChange = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    hasChange = true;
                }
            }
        }
    }
}
