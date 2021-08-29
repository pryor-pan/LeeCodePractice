package com.string;

import java.util.Arrays;

/**
 * Remarks:         1528. 重新排列字符串
 *                      https://leetcode-cn.com/problems/shuffle-string/
 * Author:panlai
 * :Date:2021/5/22
 */
public class No1528_restoreString {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[indices[i]] = ch;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch :arr) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
