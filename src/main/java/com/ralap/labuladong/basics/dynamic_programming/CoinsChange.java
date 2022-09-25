package com.ralap.labuladong.basics.dynamic_programming;

/**
 * 凑硬币
 */
public class CoinsChange {

    public int solution(int[] coins, int amount) {
        // base case
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        // 状态： amount
        int min = Integer.MAX_VALUE;
        // 选择,倒推
        for (int i = 0; i < coins.length; i++) {
            int sub = solution(coins, amount - coins[i]);
            if (sub == -1) {
                continue;
            }
            min = Math.min(min, sub);
        }
        return min == Integer.MAX_VALUE ? -1 : min + 1;
    }

    /**
     * 备忘录解法
     *
     * @param coins  硬币面值
     * @param amount 目标金额
     * @return 最少硬币数
     */
    public int memorandumSolution(int[] coins, int amount) {
        // base case
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int[] memo = new int[amount + 1];
        if (memo[amount] != 0) {
            return memo[amount];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int sub = memorandumSolution(coins, amount - coins[i]);
            if(sub == -1) continue;
            min = Math.min(min, sub +1);
        }
        memo[amount] = (min == Integer.MAX_VALUE ? -1 : min);
        return memo[amount];
    }

    /**
     * DPTable解法
     * @param coins 银币面值
     * @param amount 目标金额
     * @return 最少硬币数
     */
    public int dpTableSolution(int[] coins, int amount) {
        // base case
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                // 无解，跳过
                if(i -coins[j] < 0) continue;
                min = Math.min(min, dp[i - coins[j]] + 1);
            }
            // 无解：-1
            dp[i] = (min == Integer.MAX_VALUE ? -1 : min);
        }
        return dp[amount];
    }

}
