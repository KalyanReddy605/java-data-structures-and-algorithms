package com.maths;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1=num;
		int temp=0;
		while(num>0) {
			int digit = num%10;
			temp= temp*10+digit;
			num =num/10;
		}
		if(temp==num1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		sc.close();
		
	}

}
