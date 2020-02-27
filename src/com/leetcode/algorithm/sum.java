package com.leetcode.algorithm;

/**
 * @description:
 * @author: wenyidao
 * @create: 2020-01-05 14:21
 **/
public class sum {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;
        int[] ret = twoSum(nums,target);
        for(int i : ret) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
            return new int[2];
        }
        int[] retArray = new int[2];
        int len = nums.length;
        for(int i=0; i<len; ++i){
            for(int j=i+1; j<len; ++j){
                if(nums[i]<=target
                        && nums[j]<=target
                        && nums[i]+nums[j] == target){
                    retArray[0] = i;
                    retArray[1] = j;
                }
            }
        }
        return retArray;
    }
}

