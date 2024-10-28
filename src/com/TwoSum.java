package com;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

    	//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
    	//Input: nums = [3,2,4], target = 6
    	//Output: [1,2]

        // Test case 1
        int[] nums1 = {2, 7, 11, 15}; // target = 9
        int target1 = 9;
        solution(nums1, target1);

        // Test case 2
        int[] nums2 = {3, 2, 4}; // target = 6
        int target2 = 6;
        solution(nums2, target2);

        // Test case 3
        int[] nums3 = {3, 3}; // target = 6
        int target3 = 6;
        solution(nums3, target3);
    }

    private static void solution(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                System.out.println("Indices: " + map.get(diff) + ", " + i);
                return;
            }

            map.put(nums[i], i); // Store the number and its index
        }

        System.out.println("No solution found.");
    }
}
