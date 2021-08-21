package com.string;

/**
 * Remarks:             344. 反转字符串
 *              https://leetcode-cn.com/problems/reverse-string
 * Author:panlai
 * :Date:2021/5/16
 */
public class No344_ReverseString {

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tmp;
        }
    }

}
