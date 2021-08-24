package com.string;

/**
 * Remarks: 709. 转换成小写字母
 * Author:panlai
 * :Date:2021/4/22
 */
public class No709_Casetollower {
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "here";
        String str2 = "LOVELY";

        System.out.println(toLowerCase(str));
        System.out.println(toLowerCase(str1));
        System.out.println(toLowerCase(str2));

    }
}
