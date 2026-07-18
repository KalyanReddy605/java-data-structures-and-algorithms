package com.string;

import java.util.Scanner;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		boolean result = checkPalindromeOrNot( name);
		if(result) {
			System.out.println("The Given String is Palindrome");
		}
		else {
			System.out.println("The Given String is Not Palindrome");
		}
		
		sc.close();

	}

	private static boolean checkPalindromeOrNot(String name) {
		int left = 0 ;
		int right = name.length()-1;
		while(left<right) {
			if(name.charAt(left) != name.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
