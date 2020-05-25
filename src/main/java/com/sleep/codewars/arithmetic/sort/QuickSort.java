package com.sleep.codewars.arithmetic.sort;

/**
 * author：xingkong on 2020/4/7
 * e-mail：xingkong@changjinglu.net
 */
class QuickSort {
    public static void main(String[] args) {
        int[] array = {6, 3, 7, 24, 354, 8354, 245, 8, 56, 3};
        quickSort2(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i + "");
        }
    }

//    private static void quickSort(int[] array, int low, int high) {
//        if (low >= high) return;
//
//        int p = partition(array, low, high);
//        quickSort(array, low, p - 1);
//        quickSort(array, p + 1, high);
//    }
//
//    private static int partition(int[] array, int low, int high) {
//        swap(array, low + (high - low) / 2, high);
//        int i, j;
//        for (i = low, j = low; j < high; j++) {
//            if (array[j] <= array[high]) {
//                swap(array, i++, j);
//            }
//        }
//        swap(array, i, high);
//        return i;
//    }

    private static void quickSort2(int[] array, int low, int high) {
    }

    private static int partition2(int[] array, int low, int high) {
        return 0;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
