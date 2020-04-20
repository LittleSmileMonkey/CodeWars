package com.sleep.codewars.arithmetic.sort;

/**
 * author：xingkong on 2020/3/16
 * e-mail：xingkong@changjinglu.net
 */
class MergeSort {
    public static void main(String[] args) {
        int[] array = {6, 3, 7, 24, 354, 8354, 245, 8, 56, 3};
        mergeSort2(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i + "");
        }


    }

    private static void mergeSort(int[] array, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] copy = array.clone();

        //定义k表示从什么位置开始修改指针，i表示左半边的起始位置，j表示右半边其实位置
        int k = low, i = low, j = mid + 1;

        while (k <= high) {
            if (i > mid) {
                array[k++] = copy[j++];
            } else if (j > high) {
                array[k++] = copy[i++];
            } else if (copy[i] > copy[j]) {
                array[k++] = copy[j++];
            } else {
                array[k++] = copy[i++];
            }
        }
    }

    private static void mergeSort2(int[] array, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort2(array, low, mid);
        mergeSort2(array, mid + 1, high);
        merge2(array, low, mid, high);
    }

    private static void merge2(int[] array, int low, int mid, int high) {
        int[] clone = array.clone();
        int i = low, j = low, k = mid + 1;
        while (i <= high) {
            if (j > mid) {
                array[i++] = clone[k++];
            } else if (k > high) {
                array[i++] = clone[j++];
            } else if (clone[j] > clone[k]) {
                array[i++] = clone[k++];
            } else {
                array[i++] = clone[j++];
            }
        }
    }
}
