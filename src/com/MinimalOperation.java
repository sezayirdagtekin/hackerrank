package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimalOperation {

	public static void main(String[] args) {

		// Input aab transforms into ab with 1 operation (remove the extra a).
		// Input abb transforms into ab with 1 operation (remove the extra b).

		List<String> words = Arrays.asList("ab", "aab", "abb", "abab", "abaaaba");

		// Output:[0, 1, 1, 0, 1]

		System.out.println(MinimalOperation.minOps(words));

	}

	private static List<Integer> minOps(List<String> words) {

		List<Integer> nums = new ArrayList<>();

		for (String word : words) {
			int operation = 0;
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) == word.charAt(i - 1)) {
					operation++;
					i++;
				}

			}

			nums.add(operation);

		}

		return nums;
	}

}
