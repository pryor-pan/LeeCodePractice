package com.arrays;

/**
 * Remarks:     1295. 统计位数为偶数的数字
 *              给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 *              输入：nums = [12,345,2,6,7896]
 *              输出：2
 * Author:panlai
 * :Date:2021/4/22
 */
public class No1295_findNumber {
    public static int findNumbers(int[] nums) {
        int cuont = 0;
        for (int num:nums) {
            int i = 0;
            while(num!=0){
                num /= 10;
                i++;
            }
            if (i % 2 == 0){
                cuont++;
            }
        }
        return cuont;
    }

    public static void main(String[] args) {
        int[] array = {555,901,482,1771};

        System.out.println(findNumbers(array));
    }
}
