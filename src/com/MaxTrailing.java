package com;

public class MaxTrailing {

	public static void main(String[] args) {
		/*
		
		Example Input and Output:
		Example 1:
		Input: arr = [5, 3, 6, 7, 4]
		Output: 4
		Explanation:
		
		The valid pairs are:
		(5, 6) → 6 - 5 = 1
		(5, 7) → 7 - 5 = 2
		(3, 6) → 6 - 3 = 3
		(3, 7) → 7 - 3 = 4 (maximum difference)
		Maximum trailing difference is 4.
		 */
		
		int[] arr = { 5, 3, 6, 7, 4 };

		int result = findMaxTailing(arr);
		System.out.println("Result:" + result);

	}

	private static int findMaxTailing(int[] arr) {
		if (arr == null || arr.length < 2) {
			return -1;
		}

		int minElement=arr[0];
		int maxDiff=-1;
		
		for(int i=1;i< arr.length;i++) {
			if(arr[i]>minElement) {
				maxDiff=Math.max(maxDiff, arr[i]-minElement);
			}
			minElement=Math.min(minElement, arr[i]);
		}
		return maxDiff;
	}

}
