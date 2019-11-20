package com.sleep.codewars.arithmetic.day01;

import java.util.Arrays;


/**
 * Created by sleep on 2017/12/4
 * sleepym09@163.com
 *
 * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks
 * whether the two arrays have the "same" elements,with the same multiplicities.
 * "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 *
 * Examples:
 *  Valid arrays
 *      a = [121, 144, 19, 161, 19, 144, 19, 11]
 *      b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 *      comp(a, b) returns true because in b 121 is the square of 11,
 *      14641 is the square of 121,
 *      20736 the square of 144,
 *      361 the square of 19,
 *      25921 the square of 161,
 *      and so on. It gets obvious if we write b's elements in terms of squares:
 *      a = [121, 144, 19, 161, 19, 144, 19, 11]
 *      b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 *
 */
public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null){
            return false;
        }
        final int[] sameData = {0};
        Arrays.stream(b).forEach(data -> Arrays.stream(a).distinct().forEach(each -> {
                    if (data == each * each) {
                        sameData[0]++;
                    }
                })
        );

        return sameData[0] == b.length;
    }

    public static boolean compBest(final int[] a, final int[] b) {
        return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }
}
