package com.searchingalgorithm;

public class CeilingOfANumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,67,89,789,2334 };
		

		int target = 69;

		int index = binarySearch(arr, target);

		System.out.println(index);

	}

	private static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			
			int mid = (right + left) / 2;
			if (target == arr[mid]) {
				return arr[mid];
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			if(right==left) {
				return arr[mid];
			}
		}
		return arr[right];
	}

}
