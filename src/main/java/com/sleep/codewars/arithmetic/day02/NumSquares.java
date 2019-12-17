package com.sleep.codewars.arithmetic.day02;

/**
 * author：xingkong on 2019/11/21
 * e-mail：xingkong@changjinglu.net
 * <p>
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。
 * 你需要让组成和的完全平方数的个数最少。
 * <p>
 * 示例 1:
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * <p>
 * 示例 2:
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/perfect-squares
 */
class NumSquares {

    public static void main(String[] args) {
        System.out.println(String.format("test [%s]","http://api.changjinglu.net/api/matrix/qr-code-check-consume?uniqueId=49c07b4195cec3a67855abc339982928"));
    }

    private int[] memo;

    public int numSquares(int n) {
        //从1开始
        memo = new int[n + 1];
        return dpResolve(n);
    }

    //动态规划解法
    private int dpResolve(int n) {
        int[] memo = new int[n+1];
        for (int i = 0;i<=n+1;i++)  memo[i]=i;

        for(int i = 2;i<=n;i++){
            for (int j = 1;j*j<=i;j++){
                memo[i] = Math.min(memo[i],memo[i-j*j]+1);
            }
        }
        return memo[n];
    }

    //递归解法
    private int recursiveResolve(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        int val = (int) Math.sqrt(n);
        if (val * val == n) {
            return memo[n];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i * i < n; i++) {
            //动态转移方程
            res = Math.min(res, numSquares(n - i * i) + 1);
        }
        return memo[n] = res;
    }
}
