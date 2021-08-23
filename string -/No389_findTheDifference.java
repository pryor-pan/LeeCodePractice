package com.string;

/**
 * Remarks:             389. 找不同
 *                          https://leetcode-cn.com/problems/find-the-difference/
 * Author:panlai
 * :Date:2021/5/19
 */
public class No389_findTheDifference {

    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i)-'a']--;
            if (cnt[t.charAt(i)-'a']<0){
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
