package com.twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 4, 5, 6, 3, 22, 13, 45, 23, 87 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int[] values = twosum(arr, target);
		System.out.println(Arrays.toString(values));
		sc.close();			
		
		
	}
	

	

	private static int[] twosum(int[] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
}
