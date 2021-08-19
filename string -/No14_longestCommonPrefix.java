package com.string;

/**
 * @Name: No14_longestCommonPrefix
 * @Description:        最长公共前缀
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * @Author: panlai
 * @Date: 2021/8/12 11:35
 */

public class No14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0){
            return "";
        }
        int n = strs.length;
        String prefix = strs[0];
        //for循环遍历字符串数组，获取到最长前缀
        for (int i = 0; i < n; i++) {
            prefix = currentPrefix(prefix,strs[i]);
            if (prefix == ""){      //经过一次比较厚，一旦前缀为空，则已经出现没公共前缀的元素，直接break；
                break;
            }
        }
        return prefix;
    }
    //用来比较当前字符串和已经存储到的前缀，获取新的最长前缀
    public String currentPrefix(String str1,String str2){
        int len = Math.min(str1.length(),str2.length());
        int i;
        for (i= 0; i < len; i++) {
            if (str1.charAt(i)!=str2.charAt(i)){
                break;
            }
        }
        return str1.substring(0,i);
    }

}
