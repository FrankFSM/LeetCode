package com.ralap.sgg.arr;

import java.util.Arrays;

/**
 * 稀疏数组
 */
public class SparseArray {

    public int[][] arr2Sparse(int[][] arr) {

        long sum[] = {0};
        // 计算不为0的个数
        Arrays.stream(arr).forEach(s -> {
            sum[0] += Arrays.stream(s).filter(item -> item != 0).count();
        });
        int count = (int) sum[0] + 1;
        // 初始化稀疏数组
        int[][] sparseArr = new int[count][3];
        sparseArr[0][0] = arr.length;
        sparseArr[0][1] = arr[0].length;
        sparseArr[0][2] = count;
        int currCount = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sparseArr[currCount][0] = i;
                    sparseArr[currCount][1] = j;
                    sparseArr[currCount][2] = arr[i][j];
                    currCount++;
                }
            }
        }
        return sparseArr;
    }

    public int[][] sparse2Arr(int[][] sparse) {
        int arr[][] = new int[sparse[0][0]][sparse[0][1]];
        for (int i = 1; i < sparse.length; i++) {
            arr[sparse[i][0]][sparse[i][1]] = sparse[i][2];
        }
        return arr;
    }
}
