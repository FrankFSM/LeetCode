package com.ralap.sgg.arr;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SparseArrayTest {

    @Test
    public void arr2Sparse() {
        SparseArray test = new SparseArray();
        int[][] arr = new int[11][11];
        arr[1][1] = 1;
        arr[2][2] = 2;
        int[][] sparse = test.arr2Sparse(arr);

        Arrays.stream(sparse).forEach(item->{
            Arrays.stream(item).forEach(num->{
                System.out.print(num + "\t");
            });
            System.out.println();
        });
    }

    @Test
    public void sparse2Arr() {
        SparseArray test = new SparseArray();
        int[][] sparse = {
                {11,11,3},
                {1,1,1},
                {2,2,2}
        };
        int[][] arr = test.sparse2Arr(sparse);


        Arrays.stream(arr).forEach(item->{
            Arrays.stream(item).forEach(num->{
                System.out.print(num + "\t");
            });
            System.out.println();
        });
    }
}