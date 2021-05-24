package com.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Remarks:         217. 存在重复元素
 *                      https://leetcode-cn.com/problems/contains-duplicate/
 * Author:panlai
 * :Date:2021/5/18
 */
public class No217_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i:nums) {
            set.add(i);
        }
        return !(set.size()==nums.length);
    }
}
