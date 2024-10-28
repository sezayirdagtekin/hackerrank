package com;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

public class sumOfDigit {
	

	public static void main(String[] args) {

/*
 * Problem Statement: Write a Java program to take a five-digit integer as input
 * and find the sum of its digits. Your program should take an integer as input
 * and return the sum of the digits.
 * 
 * Input Format: A single line containing a five-digit integer n (10000 ≤ n ≤  99999).
 */

	
		sumOfDigit(67890);	
		sumOfDigit(12345);
		
		
	}

	private static void sumOfDigit(int num) {
		int division=10_000;
		int sum=0;
		while(division>0) {
			sum=sum+num/division;
			num =num %division;
			division=division/10;
			
		}
		 System.out.println("Sum of digits: " + sum);
	}



}

