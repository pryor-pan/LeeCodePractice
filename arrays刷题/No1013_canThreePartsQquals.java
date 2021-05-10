package com.arrays;

/**
 * Remarks:  1013. 将数组分成和相等的三个部分
 *              给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 *              输入：[0,2,1,-6,6,-7,9,1,2,0,1]
 *              输出：true
 *              解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 *
 *
 *
 * Author:panlai
 * :Date:2021/4/26
 */
public class No1013_canThreePartsQquals {
    public boolean canThreePartsEqualSum(int[] arr) {
        int  s = 0;
        for (int num : arr) {
            s += num;
        }
        if (s%3 != 0){
            return false;
        }
        int part = s/3;
        int n = arr.length;
        int i = 0;
        int cur = 0;
        while(i < n){
            cur += arr[i];
            if (cur == part){
                break;
            }
            i++;
        }
        if (cur != part){
            return false;
        }
        int j = i+1;
        while (j+1<n){
            cur += arr[j];
            if (cur == part*2){
                return true;
            }
            j++;
        }
        return false;
    }

}
