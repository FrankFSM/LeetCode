package com.ralap._80;

public class _73_SetMatrixZeroes {
    public void solution(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        boolean[] rows = new boolean[rowCount];
        boolean[] cols = new boolean[colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = cols[j] = true;
                }
            }
        }
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {

                if(rows[i] || cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
