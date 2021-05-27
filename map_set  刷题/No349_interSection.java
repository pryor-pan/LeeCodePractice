package com.map_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Remarks:         349. 两个数组的交集
 *              https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * Author:panlai
 * :Date:2021/5/17
 */
public class No349_interSection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int[] ret = new int[set.size()];
        int i =0;
        for (int x:set) {
            ret[i] = x;
            i++;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] arr3 = intersection(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }
}
