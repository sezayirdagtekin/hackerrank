package com;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RearrangeCharactersPalindrome {

	public static void main(String[] args) {

		/*
		 * Given a string s, write a function to determine if the characters of the
		 * string can be rearranged to form a palindrome. A palindrome is a word that
		 * reads the same backward as forward (like "madam" or "racecar"). If it's
		 * possible, return "Yes", otherwise return "No".
		 */


		// Test cases
		System.out.println(solution("ivicc")); // Output: Yes
		System.out.println(solution("aaa")); // Output: Yes
		System.out.println(solution("hello")); // Output: No
		System.out.println(solution("racecar"));// Output: Yes

	}

	private static String solution(String str) {
		  // Create a frequency map of the characters in the string
        var map = str.chars()
                     .mapToObj(c -> (char)c)
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        // Count how many characters have odd frequencies
        var oddCount = map.values().stream().filter(count -> count % 2 != 0).count();

        // A string can be rearranged into a palindrome if there's at most one odd frequency
        return oddCount <= 1 ? "Yes" : "No";
}
	
}
