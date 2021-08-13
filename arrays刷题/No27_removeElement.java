package com.arrays;

/**
 * @Name: No27_removeElement
 * @Description:        移除元素
 *      https://leetcode-cn.com/problems/remove-element/
 * @Author: panlai
 * @Date: 2021/8/12 11:31
 */

public class No27_removeElement {
    public int removeElement(int[] nums, int val) {
        int newLen = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != val){
                nums[newLen] = nums[i] ;
                newLen++;
            }
        }
        return newLen;
    }
}
