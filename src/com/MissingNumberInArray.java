package com;
import java.util.stream.IntStream;

public class MissingNumberInArray {

	public static void main(String[] args) {
		/**
		 * Problem: Find the Missing Number in an Array Problem Statement: You are given
		 * an array containing n distinct numbers taken from the range 0, 1, 2, ..., n.
		 * Since one number is missing from the range, find the missing number.
		 */

		// input : arr = [3, 0, 1]
		// out put: 2

		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		solution(arr);

	}

	private static int solution(int[] arr) {

		// Calculate the expected sum using the formula for sum of first n numbers
		int expectedSum = arr.length * (arr.length + 1) / 2;

		// Calculate the actual sum of the array elements
		int actualSum = IntStream.of(arr).sum();

		// Return the difference which is the missing number
		return expectedSum - actualSum;

	}

}
