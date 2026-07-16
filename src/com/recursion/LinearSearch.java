package com.recursion;

public class LinearSearch {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,88,33,44,109,87,34,23};
		int target = 109;
		System.out.println(linearSearch(arr,target,0));
		
		
	}

	private static int linearSearch(int[] arr,int target,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(target==arr[i]) {
			return i;
		}
		else {
			return linearSearch(arr,target,i+1);
		}
	}

}
