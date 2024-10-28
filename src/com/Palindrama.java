package com;
import java.util.Collection;
import java.util.List;

public class Palindrama {

	public static void main(String[] args) {
		


		String str = "radar";

		System.out.println(check(str));
	}

	private static boolean check(String str) {

		int j = str.length() - 1;
		int i = 0;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;

	}

}
