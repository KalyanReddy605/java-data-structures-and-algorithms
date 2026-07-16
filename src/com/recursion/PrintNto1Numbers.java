package com.recursion;

import java.util.Scanner;

public class PrintNto1Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
		sc.close();

	}

	private static void print(int n) {
		
		if(n==1) {
			System.out.print(n+" ");
			return ;
		}
		print(n-1);
		System.out.print(n+" ");
	}

}
