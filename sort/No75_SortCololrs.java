package com.sort;

/**
 * Remarks:                 75. 颜色分类（荷兰旗问题）
 *                                  给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 *                                  此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *                                  输入：nums = [2,0,2,1,1,0]
 *                                  输出：[0,0,1,1,2,2]
 *
 *
 * Author:panlai
 * :Date:2021/5/14
 */
public class No75_SortCololrs {
    public void swap(int[] array,int index1,int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public void sortColors(int[] nums) {
        int len = nums.length;
        if (len<2){
            return;
        }

        int left = 0;
        int i = 0;
        int right = len-1;

        while (i<= right){
            if (nums[i] == 0){
                swap(nums,left,i);
                i++;
                left++;
            }else if (nums[i] == 2){
                swap(nums,i,right);
                right--;
            }else{
                i++;
            }
        }
    }
}
