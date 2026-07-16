package com.searchingalgorithm;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 99, 110, 156, 178, 1456 };
		int left = 0;
		int right = arr.length - 1;
		int target = 99;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				System.out.println("Found at index: " + mid);
				break;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

	}

}
