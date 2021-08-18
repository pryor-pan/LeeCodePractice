package com.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/24 20:24
 */

public class No13_romanToInt {
    Map<Character,Integer> map = new HashMap<Character, Integer>(){
        {
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }
    };

    public int roomToInt(String s){
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = map.get(s.charAt(i));
            if (i < n - 1 && value < map.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }

}
