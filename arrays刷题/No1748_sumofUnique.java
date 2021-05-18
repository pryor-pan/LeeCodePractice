package com.arrays;

/**
 * Remarks: 1748. 唯一元素的和
 *              给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
 *              请你返回 nums 中唯一元素的 和 。
 *              输入：nums = [1,2,3,2]
 *              输出：4
 *              解释：唯一元素为 [1,3] ，和为 4 。
 * Author:panlai
 * :Date:2021/4/23
 */
public class No1748_sumofUnique {
    public static int sumOfUnique(int[] nums) {
        int res = 0;                    //用来求和
        int[] array = new int[101];     //定义一个新的数组用来标记原数组中每个元素出现了几次。
        for (int i = 0;i< nums.length;i++){
            array[nums[i]]++;           //如果原数组中数字出现，则把对应位置的元素++
        }
        for (int i = 0; i <nums.length ; i++) {
            if (array[nums[i]] == 1){   //最后根据判断对应位置为1的元素只出现了一次，将他们加起来。
                res += nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2};
        System.out.println(sumOfUnique(array));

    }
}
