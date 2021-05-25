package com.arrays;

import java.util.Arrays;

/**
 * Remarks:         561. 数组拆分 I
 *              https://leetcode-cn.com/problems/array-partition-i/
 * Author:panlai
 * :Date:2021/5/22
 */
public class No561_arrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length; i+=2) {
            ret += nums[i];
        }
        return ret;
    }
}
