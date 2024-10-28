package com;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		
		/**
		 * Given a string, find the first non-repeating character in that string and return that character.
		 *  If there is no non-repeating character, return the '-' character.
		 */
		//s = "loveleetcode"  output: v
		
		
        System.out.println(solution("leetcode"));     // Output: l
        System.out.println(solution("loveleetcode")); // Output: v
        System.out.println(solution("aabbcc"));       // Output: 


	}

	private static Character solution(String str) {
		
	 return str.chars().mapToObj(c-> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream()
		.filter(e-> e.getValue()==1)
		.map(e->e.getKey())
		.findFirst().orElse('-');
	}

}
