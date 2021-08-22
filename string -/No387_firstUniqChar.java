package com.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Remarks:             387. 字符串中的第一个唯一字符
 *                            https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * Author:panlai
 * :Date:2021/5/17
 */
public class No387_firstUniqChar {

    //方法一：
    public int firstUniqChar(String s) {
        Map<Character,Integer>  map = new HashMap<>();
        for (char ch :s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i = 0;
        for (char ch:s.toCharArray()) {
            if (map.get(ch) == 1){
                return i;
            }
            i++;
        }
        return -1;
    }
    //方法二：
    public int firstUniqChar2(String s) {
        int[] arr = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            arr[ch-97]++;
        }
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (arr[ch-97] == 1){
                return i;
            }
        }
        return -1;
    }

}
