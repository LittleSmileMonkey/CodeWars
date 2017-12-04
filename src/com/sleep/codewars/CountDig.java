package com.sleep.codewars;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sleep on 2017/12/4
 * sleepym09@163.com.
 *
 * Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
 * Square all numbers k (0 <= k <= n) between 0 and n.
 * Count the numbers of digits d used in the writing of all the k**2.
 * Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.
 *
 * Examples:
 *      n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
 *      We are using the digit 1 in 1, 16, 81, 100. The total count is then 4.
 */
public class CountDig {

    public static void main(String[] args) {
        int i = nbDig(5750, 0);
        Logger.getGlobal().log(Level.INFO,"i = "+ i);
    }

    public static int nbDig(int n, int d) {
        int countDig = 0;
        // your code
        for (int i=0; i*i < n ; i++){
            String currentIntValue = String.valueOf(i * i);
            for (byte eachNum : currentIntValue.getBytes()) {
                if((int) eachNum == d) countDig++;
            }
        }
        return countDig;
    }
}
