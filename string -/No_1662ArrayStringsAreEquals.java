package com.string;

/**
 * Remarks: 1662. 检查两个字符串数组是否相等
 *              给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
 *              数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。
 *              输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
 *              输出：true
 *
 * Author:panlai
 * :Date:2021/4/23
 */
public class No_1662ArrayStringsAreEquals {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String str : word1) {
            sb1.append(str);
        }
        for (String str : word2) {
            sb2.append(str);
        }
         return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] array1 = {"ab","c"};
        String[] array2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(array1, array2));

    }
}
