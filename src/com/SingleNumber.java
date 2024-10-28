package com;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {

	/*
		 * 
		 * Given a non-empty array of integers nums, every element appears twice except
		 * for one. Find that single one.
		 * 
		 * You must implement a solution with a linear runtime complexity and use only
		 * constant extra space.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [2,2,1] Output: 1 Example 2:
		 * 
		 * Input: nums = [4,1,2,1,2] Output: 4 Example 3:
		 * 
		 * Input: nums = [1] Output: 1
		 */


    public static void main(String[] args) {

        int[] nums1 = { 2, 2, 1 };
        int[] nums2 = { 4, 1, 2, 1, 2 };
        int[] nums3 = { 1 };

        System.out.println(solution(nums1)); // Output: 1
        System.out.println(solution(nums2)); // Output: 4
        System.out.println(solution(nums3)); // Output: 1
    }

    public static int solution(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result =result ^ num; // XOR all elements
        }
        return result;
    }
}
