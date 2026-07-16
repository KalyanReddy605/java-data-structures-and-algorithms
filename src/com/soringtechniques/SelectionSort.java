package com.soringtechniques;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 7, 0, -1, 0 };
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {
		 for (int i = 0; i < arr.length - 1; i++) {

	            int minIndex = i;

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	}

}
