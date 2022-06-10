package com.ralap.c_sort;

import com.ralap.comm.RandomArrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;
    private List<int[]> params;
    private int[] result;
    private int errorCount = 0;
    private long startTim;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        params = RandomArrays.GeneratorRandomArray(100, 10);
        startTim = System.currentTimeMillis();

    }

    @After
    public void tearDown() throws Exception {
        long useMill =  System.currentTimeMillis() - startTim;
        System.out.print("测试完成: 用时 " + useMill + "毫秒,");
        if (errorCount == 0) {
            System.out.println("恭喜，全部通过");
        } else {
            System.out.println("存在未通过，异常率： " + errorCount / (double) params.size() * 100 + "%");
        }
    }

    /**
     * 与系统排序对比，异常则输出
     */
    private void errorPrint(int[] target, int[] source) {
        Arrays.sort(target);
        if (Arrays.compare(target, source) != 0) {
            Arrays.stream(target).forEach(value -> {
                System.out.print(value + ",");
            });
            System.out.print(" --- ");
            Arrays.stream(target).forEach(value -> {
                System.out.print(value + ",");
            });
            System.out.println("<排序异常>");
            errorCount++;
        }
    }


    @Test
    public void bubbleSort() {

        params.forEach(item -> {
            int[] copyItem = Arrays.copyOf(item, item.length);
            result = solution.bubbleSort(copyItem);
            errorPrint(item, result);
        });

    }

    @Test
    public void selectSort() {
        params.forEach(item -> {
            int[] copyItem = Arrays.copyOf(item, item.length);
            result = solution.selectSort(copyItem);
            errorPrint(item, result);
        });
    }

    @Test
    public void insertSort() {
        params.forEach(item -> {
            int[] copyItem = Arrays.copyOf(item, item.length);
            result = solution.insertSort(copyItem);
            errorPrint(item, result);
        });
    }




}