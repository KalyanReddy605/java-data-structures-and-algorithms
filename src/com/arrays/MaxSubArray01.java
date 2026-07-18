package com.arrays;

import java.util.Arrays;

public class MaxSubArray01 {

	public static void main(String[] args) {

		int[] array = { 2, 4, 6, 8, 10 };
		int[] prefixarray = new int[array.length];

		prefixarray[0] = array[0];

		for (int i = 1; i < array.length; i++) {
			prefixarray[i] = prefixarray[i - 1] + array[i];
		}

		System.out.println(Arrays.toString(prefixarray));

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			int start = i;

			for (int j = i; j < array.length; j++) {
				int end = j;

				int currentSum;

				if (start == 0) {
					currentSum = prefixarray[end];
				} else {
					currentSum = prefixarray[end] - prefixarray[start - 1];
				}

				if (currentSum > max) {
					max = currentSum;
				}
			}
		}

		System.out.println("Maximum Subarray Sum = " + max);
	}
}