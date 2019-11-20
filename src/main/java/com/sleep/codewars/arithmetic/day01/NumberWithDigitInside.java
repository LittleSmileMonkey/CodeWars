package com.sleep.codewars.arithmetic.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.LongStream;

/**
 * You have to search all numbers from inclusive 1 to inclusive a given number x, that have the given digit d in it.
 * The value of d will always be 0 - 9.
 * The value of x will always be greater than 0.
 * You have to return as an array:[
 *  the count of these numbers,
 *  their sum
 *  and their product].
 */

public class NumberWithDigitInside {


    public static void main(String[] args) {
        System.out.print(Arrays.toString(NumberWithDigitInside(44, 4)));
    }

    public static long[] NumberWithDigitInside(long x, long d) {
        ArrayList<Long> accordDigits = new ArrayList<>();
        ArrayList<Long> result = new ArrayList<>();

        //the count of these number
        for (long i = 1; i <= x; i++) {
            long tempNumber = i;
            if(String.valueOf(tempNumber).contains(String.valueOf(d))){
                //contains d
                accordDigits.add(tempNumber);
            }
        }
        result.add((long) accordDigits.size());

        //their sum
        long sumResult = 0;
        for (Long accordDigit : accordDigits) {
            sumResult += accordDigit;
        }
        result.add(sumResult);

        //their product
        long productResult = 0;
        for (int i = 0; i < accordDigits.size(); i++) {
            if(i == 0){
                productResult = accordDigits.get(0);
            }else {
                productResult = productResult * accordDigits.get(i);
            }
        }
        result.add(productResult);

        long[] arrayResultnew = new long[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrayResultnew[i] = result.get(i);
        }
        return arrayResultnew;
    }

    /**
     * Best Practices
     * @param x
     * @param d
     * @return
     */
    public static long[] NumbersWithDigitInside(long x, long d)  {
        long count = 0, sum = 0, prod = 0;

        for (long i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                count++;
                sum += i;
                prod = prod == 0 ? i : prod * i;
            }
        }

        return new long[]{count, sum, prod};
    }

    /**
     * 基于steamAPI完成的方法
     * @param x
     * @param d
     * @return
     */
    public static long[] NumberssWithDigitInside(long x, long d)
    {
        return LongStream.rangeClosed(1, x).filter(value ->
                String.valueOf(value).contains(String.valueOf(d))
        ).collect(() -> new long[3], (result, v) -> {
            result[0]++;
            result[1] += v;
            result[2] = result[2] == 0 ? v : result[2] * v;
        }, null);
    }
}
