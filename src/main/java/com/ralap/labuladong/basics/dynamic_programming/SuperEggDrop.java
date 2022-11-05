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
        // 楼层不存
        if (floorCount == 0) return 0;
        // 鸡蛋只有一个，逐层遍历
        if (eggCount == 1) return floorCount;
        String key = eggCount + "," + floorCount;
        if(dpTable.get(key) != null){
            return dpTable.get(key);
        }
        int result = Integer.MAX_VALUE;
        // 逐层楼抛出鸡蛋（选择）
        for (int i = 1; i <= floorCount; i++) {
            // 鸡蛋碎了
            int broken = dp(eggCount-1, i -1);
            // 鸡蛋没碎
            int unBroken = dp(eggCount, floorCount - i);
            // 最坏情况
            int bad = Math.max(broken, unBroken) + 1;
            // 最少次数
            result = Math.min(result, bad);

        }
        dpTable.put(key, result);
        return result;
    }

}
