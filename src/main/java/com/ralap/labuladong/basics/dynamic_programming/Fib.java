package com.ralap.labuladong.basics.dynamic_programming;

/**
 * 斐波那契数列
 */
public class Fib {

    public int solution(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return solution(num - 1) + solution(num - 2);
    }


    /**
     * dp table
     * 自底向上
     */
    public long dpTableSolution(int num) {
        if (num == 0) {
            return 0;
        }
        long pre = 1;
        long curr = 1;
        for (int i = 2; i < num; i++) {
            long sum = pre + curr;
            // 状态压缩
            pre = curr;
            curr = sum;
        }
        return curr;
    }

    /**
     * 备忘录
     * 自顶向下
     */
    public long memorandumSolution(int num) {
        long[] memo = new long[num + 1];
        return memorandumHelper(memo, num);
    }

    public long memorandumHelper(long[] memo, int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        if (memo[num] != 0) {
            return memo[num];
        }
        memo[num] = memorandumHelper(memo, num - 1) + memorandumHelper(memo, num - 2);
        return memo[num];
    }
}
