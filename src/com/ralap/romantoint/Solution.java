package com.ralap.romantoint;

import com.ralap.comm.ListNode;

import java.util.HashMap;
import java.util.Map;


/**
 * 13. 罗马数字转整数
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.romanToInt("MCMXCIV");
        System.out.println(result);
    }

    /**
     * 时间复杂度:O(N)
     * 空间复杂度O(1)
     *
     * @return
     */
    public int romanToInt(String s) {
        Map<String, Integer> source = new HashMap(8);
        source.put("I", 1);
        source.put("V", 5);
        source.put("X", 10);
        source.put("L", 50);
        source.put("C", 100);
        source.put("D", 500);
        source.put("M", 1000);

        if (source.containsKey(s))
            return source.get(s);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            int var = source.get(String.valueOf(s.charAt(i)));
            if ( i < s.length()-1 &&  var < source.get(String.valueOf(s.charAt(i + 1)))) {
                num -= var;
            } else {
                num += var;
            }
        }
        return num;
    }
}
