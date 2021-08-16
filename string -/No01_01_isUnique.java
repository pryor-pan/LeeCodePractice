package com.string;

/**
 * Remarks:         面试题 01.01. 判定字符是否唯一
 *                          https://leetcode-cn.com/problems/is-unique-lcci/
 * Author:panlai
 * :Date:2021/5/16
 */
public class No01_01_isUnique {
    public static boolean isUnique(String astr) {
        int[] arr = new int[128];
        for (char ch: astr.toCharArray()) {
            arr[ch]++;
        }
        for (int i: arr) {
            if (i>1){
                return false;
            }
        }
        return true;
    }

    public static void main1(String[] args) {
        String str = "leetcode";
        System.out.println(isUnique(str));

    }
}
