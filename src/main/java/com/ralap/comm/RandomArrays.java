package com.ralap.comm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrays {

    /**
     * 随机生成数组
     *
     * @param count     数组个数
     * @param maxLength 最大数组长度
     */
    public static List<int[]> GeneratorRandomArray(int count, int maxLength) {
        List<int[]> result = new ArrayList(count);
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int len = random.nextInt(maxLength - 1) + 1;
            int[] arr = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = random.nextInt(100);
            }
            result.add(arr);
        }
        return result;
    }

}
