package com.searchingalgorithm;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 6, 22, 11, 33, 44, 111, 2223, 22344, 4567, 0 };
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int result = linearSearch(arr, target);
		System.out.println(result);
		sc.close();

	}

	private static int linearSearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}

		}
		return -1;
	}

}
