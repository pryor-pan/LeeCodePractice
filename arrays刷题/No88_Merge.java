package com.arrays;

/**
 * Remarks:             88. 合并两个有序数组
 *                  给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，
 *                  使 nums1 成为一个有序数组。
 *
 *                  初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于
 *                  m + n，这样它就有足够的空间保存来自 nums2 的元素。
 * Author:panlai
 * :Date:2021/5/10
 */
public class No88_Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s1 = 0;
        int e1 = m-1;
        int s2 = 0;
        int e2 = n-1;
        int[] tmp = new int[m+n];
        int k = 0;//tmp数组的下标
        //两个数组当前都有数据
        while(s1 <= e1 && s2 <= e2) {
            if(nums1[s1] <= nums2[s2]) {
                tmp[k] = nums1[s1];
                s1++;
                k++;
            }else{
                tmp[k] = nums2[s2];
                s2++;
                k++;
            }
        }
        //第一个数组还有元素
        while(s1 <= e1) {
            tmp[k] = nums1[s1];
            k++;
            s1++;
        }
        while(s2 <= e2) {
            tmp[k] = nums2[s2];
            k++;
            s2++;
        }
        for(int i = 0;i < tmp.length;i++) {
            nums1[i] = tmp[i];
        }
    }
}
