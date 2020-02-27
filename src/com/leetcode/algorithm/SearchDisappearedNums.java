package com.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 查找消失的数字
 * @author: wenyidao
 * @create: 2019-12-31 18:30
 **/
public class SearchDisappearedNums {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        Arrays.sort(nums);
        List<Integer> retList = new ArrayList<>(nums.length/2);
        for(int i=1; i<=nums.length; ++i){
            int index = Arrays.binarySearch(nums,i);
            if(index < 0){
                retList.add(i);
            }
        }
        return retList;
    }
}

