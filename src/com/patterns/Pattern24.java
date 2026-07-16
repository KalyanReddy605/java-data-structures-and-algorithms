package com.patterns;

import java.util.Scanner;

public class Pattern24 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			
			for(int j = 0;j<i;j++) {
				System.out.print("* ");
			}
			for(int k =0;k<(n*2)-(i*2);k++) {
				System.out.print("  ");
			}
			for(int l =0;l<i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i =0;i<n;i++) {
			for(int j =0;j<n-i;j++) {
				System.out.print("* ");
			}
			for(int k=0;k<2*i;k++) {
				System.out.print("  ");
			}
			for(int l =0;l<n-i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
