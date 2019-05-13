package com.sleep.codewars.arithmetic;

import java.util.Arrays;

/**
 *
 * Created by sleep on 2017/12/4
 * sleepym09@163.com
 * 
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *
 * Example:
 *      HighAndLow("1 2 3 4 5") // return "5 1"
 *      HighAndLow("1 2 -3 4 5") // return "5 -3"
 *      HighAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes:
 *      All numbers are valid Int32, no need to validate them.
 *      There will always be at least one number in the input string.
 *      Output string must be two numbers separated by a single space, and highest number is first.
 */
public class Kata {

    public static String HighAndLow(String numbers) {
        // Code here or
        String[] split = numbers.split(" ");
        int maximum = Integer.valueOf(split[0]);
        int minimum = Integer.valueOf(split[0]);
        for(int i = 0 ; i < split.length ; i++){
            Integer value = Integer.valueOf(split[i]);
            if(value > maximum){
                maximum = value;
            }
            if(value < minimum){
                minimum = value;
            }
        }
        return maximum + " " + minimum;
    }

    public static String HighAndLowBest(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
}
