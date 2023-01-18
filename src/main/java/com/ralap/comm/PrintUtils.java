package com.ralap.comm;

import java.util.Arrays;
import java.util.List;

public class PrintUtils {

    public static void printArrayJoin(int[] array, String separator) {
        StringBuffer sb = new StringBuffer();
        Arrays.stream(array).forEach(item -> {
            sb.append(item);
            sb.append(separator);
        });
        sb.delete(sb.length() - separator.length(), sb.length() - 1);
        System.out.println(sb);
    }

    public static void printListJoin(List list, String separator) {
        StringBuffer sb = new StringBuffer();
        list.forEach(item -> {
            sb.append(item);
            sb.append(separator);
        });
        sb.delete(sb.length() - separator.length(), sb.length() - 1);
        System.out.println(sb);
    }

    public static void printTwoDimensionalListJoin(List<List<Integer>> list, String separator) {
        StringBuffer sb = new StringBuffer();
        list.forEach(item -> {
            item.forEach(i -> {
                sb.append(i);
                sb.append(separator);
            });
            sb.deleteCharAt(sb.lastIndexOf(","));
            sb.append("\n");

        });
        System.out.println(sb);
    }

    public static void printTwoDimensionalListJoinString(List<List<String>> list, String separator) {
        StringBuffer sb = new StringBuffer();
        list.forEach(item -> {
            item.forEach(i -> {
                sb.append(i);
                sb.append(separator);
            });
            sb.deleteCharAt(sb.lastIndexOf(","));
            sb.append("\n");

        });
        System.out.println(sb);
    }

    public static void printChar(char[][] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                sb.append(separator);
            }
            sb.delete(sb.length() - separator.length(), sb.length() - 1);
            System.out.println(sb);
        }
    }

    public static void printTwoDimensionalArray(int[][] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                sb.append(separator);
            }
            sb.delete(sb.length() - separator.length(), sb.length() - 1);
            System.out.println(sb);
        }
        System.out.println();
    }

    public static void printArray(int[] array, String separator) {
        Arrays.stream(array).forEach(item->{
            System.out.print(item + ",");
        });
    }
}
