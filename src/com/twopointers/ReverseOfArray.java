package com.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOfArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println(Arrays.toString(arr));
		Math.abs(-1);
	}
	

	private static int[] reverseOfArray(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}
}