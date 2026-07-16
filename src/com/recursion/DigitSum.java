package com.recursion;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = sumOfdigit(num);
		System.out.println(result);
        sc.close();
	}

	private static int sumOfdigit(int num) {
		if(num ==0) {
			return 0;
		}
		return (num%10)+sumOfdigit(num/10);
	}

}
