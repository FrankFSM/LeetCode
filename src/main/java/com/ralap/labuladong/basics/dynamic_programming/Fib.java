package com.ralap.labuladong.basics.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    private Map<Integer, Long> dpMap = new HashMap();

    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     */
    public long fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }
        long val = fib(n - 1) + fib(n - 2);
        return val;
    }


    public long fibPb(int n) {
        if (n == 0) {
            dpMap.put(0, 0L);
            return 0;
        }

        if (n == 1 || n == 2) {
            dpMap.put(1, 1L);
            dpMap.put(2, 1L);
            return 1;
        }
        if (dpMap.get(n) != null) {
            return dpMap.get(n);
        } else {
            Long val = fibPb(n - 1) + fibPb(n - 2);
            dpMap.put(n, val);
            return val;
        }
    }

    public long opt(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        long prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            long sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
