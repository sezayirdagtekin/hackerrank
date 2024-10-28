package com;

public class FizzBuzz {

	public static void main(String[] args) {
	
		int number=15;
		
		solution(number);
		refactoredSolution(number);
	}

	private static void solution(int number) {
		for(int i=1;i<=number;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3==0) {
				System.out.println("Fizz");
			}	
			else if(i%5==0) {
				System.out.println("Buzz");
			}	
			else {
				System.out.println(i);
			}

		}
	}
	
    private static void refactoredSolution(int number) {
        for (int i = 1; i <= number; i++) {
            String result = "";
           
            if (i % 3 == 0) result += "Fizz";
            if (i % 5 == 0) result += "Buzz";
            
 
            System.out.println(result.isEmpty() ? i : result);
        }
    }

}
