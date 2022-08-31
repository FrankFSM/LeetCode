package com.ralap.labuladong.basics.dynamic_programming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinChange {

    private Map<Integer, Integer> dpTable = new HashMap();

    public int coinChange(List<Integer> coins, int amount) {
        int rest = this.dp(coins, amount);
        System.out.println(rest);
        return rest;
    }

    private int dp(List<Integer> coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        Integer dpRet = this.dpTable.get(amount);
        if(dpRet != null){
            return dpRet;
        }
        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int subProblem = dp(coins, amount - coin);
            if (subProblem == -1)
                continue;
            min = Math.min(min, subProblem + 1);
        }
        this.dpTable.put(amount, min);
        return min;
    }
}
