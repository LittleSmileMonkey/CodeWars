package com.sleep.codewars.arithmetic.day03;

/**
 * author：xingkong on 2020/5/25
 * e-mail：xingkong@changjinglu.net
 */
class FastPower {
    public static void main(String[] args) {
        //2^4 % 5
        int i = fastPower(2, 5, 4);
        System.out.println("i = " + i);
    }

    private static int fastPower(int a, int b, int n) {
        if (n == 0) return 1 % b;
        if (n == 1) return a % b;
        // a*b % p = (a % p * b % p) % p;
        // a^n % b = (a^(n/2) % b * a^(n/2) %b) % b
        int halfPower = fastPower(a, b, n / 2);
        halfPower = (halfPower * halfPower) % b;
        if (n % 2 == 1) {
            halfPower = ((a % b) * halfPower) % b;
        }
        return halfPower;
    }
}
