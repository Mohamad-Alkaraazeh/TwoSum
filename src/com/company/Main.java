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
