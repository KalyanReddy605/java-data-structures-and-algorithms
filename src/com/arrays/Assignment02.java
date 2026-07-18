package com.arrays;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {

		int[] arrays = { 4, 5, 6, 7, 0, 1, 2 };
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int result = linearSearch(arrays, target);
		int result2 = binarySearch(arrays, target);
		System.out.println("linearSearchResult: "+result);
		System.out.println("BinarySearchResult: "+result2);
		sc.close();
	}

	private static int binarySearch(int[] arrays, int target) {
		int left = 0;
		int right = arrays.length;
		int mid = (left+right)/2;
		while(left<right) {
			if(arrays[mid]==target) {
				return mid;
			}
			else if(arrays[mid]>target) {
				
			}
			
		}
		return 0;
	}

	private static int linearSearch(int[] arrays, int target) {
		for (int i = 0; i < arrays.length; i++) {
			if (target == arrays[i]) {
				return i;
			}
		}
		return -1;
	}

}
