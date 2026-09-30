// ==========================================================
// 1. Two Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 52%)
// Memory     : 46.4 MB (Beats 97%)
// Link       : https://leetcode.com/problems/two-sum/
// ==========================================================

import java.util.HashMap;
//import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             arr[0]=i;
        //             arr[1]=j;
        //         }
        //     }
        // }
        // return arr;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(map.containsKey(value) && map.get(value)!=i){
                return new int[]{i,map.get(value)};
        }
        }
        return new int[]{};

    }
}