/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]


Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

*/



package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[][] twoSum(int[] nums, int target){
        List<int[]> resultList = new ArrayList<>();

        for (int i=0; i< nums.length - 1;i++){
            for (int j=i+1; j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    resultList.add(new int[]{i, j});
                }
            }
        }
        return resultList.toArray(new int[resultList.size()][]);
    }

    public static void main(String[] args) {

        int[] nums = {2, 19, 20, 1, 15, 21, 12, 9, 10};
        int target = 22;
        int[][] result = Main.twoSum(nums, target);
        for (int[] pair : result) {
            System.out.println("Indices: " + Arrays.toString(pair));
        }
    }
}
