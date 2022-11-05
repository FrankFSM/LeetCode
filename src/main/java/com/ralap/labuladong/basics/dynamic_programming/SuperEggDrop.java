package com.ralap.labuladong.basics.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * 高空抛鸡蛋
 */
public class SuperEggDrop {
    public Map<String, Integer> dpTable = new HashMap<>();

    public int solution(int eggCount, int floorCount) {
        return this.dp(eggCount, floorCount);
    }

    private int dp(int eggCount, int floorCount) {
        if (floorCount == 0) return 0;
        if (eggCount == 1) return floorCount;
        String key = eggCount + "," + floorCount;
        if(dpTable.get(key) != null){
            return dpTable.get(key);
        }
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= floorCount; i++) {
            result = Math.min(result, Math.max(dp(eggCount, i - 1), dp(eggCount - 1, floorCount - i)) + 1);

        }
        dpTable.put(key, result);
        return result;
    }

}
