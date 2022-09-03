package com.ralap.comm;

import java.util.Arrays;

public class PrintUtils {

    public static void printArrayJoin(int[] array, String separator) {
        StringBuffer sb = new StringBuffer();
        Arrays.stream(array).forEach(item ->{
            sb.append(item);
            sb.append(separator);
        });
        sb.delete(sb.length() - separator.length(), sb.length()-1);
        System.out.println(sb);
    }
}
