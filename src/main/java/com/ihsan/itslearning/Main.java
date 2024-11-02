package com.ihsan.itslearning;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        int target = 6;
        var result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        //[1,2]
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index = 0;
        for (int f = 0; f < nums.length; f++) {
            for (int i=0; i<nums.length; i++){
                if (f == i){
                    continue;
                }
                if (nums[f] + nums[i] == target){
                    result[index] = f;
                    index++;
                }
            }
        }
        return result;
    }
}