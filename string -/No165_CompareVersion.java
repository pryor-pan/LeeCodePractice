package com.string;

/**
 * Remarks:         165. 比较版本号
 *              https://leetcode-cn.com/problems/compare-version-numbers/
 * Author:panlai
 * :Date:2021/5/17
 */
public class No165_CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");
        int n1 = 0;
        int n2 = 0;
        int len1 = strings1.length;
        int len2 = strings2.length;
        for (int i = 0; i <Math.max(len1,len2) ; ++i) {
             n1 = i<len1?Integer.parseInt(strings1[i]):0;
             n2 = i<len2?Integer.parseInt(strings2[i]):0;
            if (n1 != n2){
                return n1>n2?1:-1;
            }

        }
        return 0;
    }


}
