package com.string;

/**
 * Remarks:  1323. 6 和 9 组成的最大数字
 *              给你一个仅由数字 6 和 9 组成的正整数 num。
 *
 *              你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 *
 *              请返回你可以得到的最大数字。
 *
 *          输入：num = 9669
 *          输出：9969
 * Author:panlai
 * :Date:2021/4/23
 */
public class No1323_max69num {
    public static int maximum69Number (int num) {
        String string = Integer.toString(num);
        char[] array = string.toCharArray();
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == '6'){
                array[i] = '9';
                break;
            }
        }
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            ret = ret.append(array[i]);
        }
        String string1 = ret.toString();
        return Integer.parseInt(string1);

    }

    public static void main(String[] args) {
        int a = 6699;
        System.out.println(maximum69Number(a));
        char[] array = {9,6,9,9};
        System.out.println(array.toString());

    }
}
