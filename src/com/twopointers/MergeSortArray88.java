package com.twopointers;

import java.util.Arrays;

public class MergeSortArray88 {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,0,0,0};
		int [] arr2 = {2,5,6};
		int n = 3;
		int m =3;
		System.out.println(Arrays.toString(arr1));
		//(n+m)log(n+m)
		int [] arr3=mergeSortArray(arr1,arr2,n,m);
		//o(n+m)
		int [] arr4=mergeSortArray01(arr1,arr2,n,m);
		System.out.println(Arrays.toString(arr4));

	}

	private static int[] mergeSortArray01(int[] arr1, int[] arr2, int n, int m) {
		
		int [] arr3 = new int[n+m];
		int p1=0,p2=0,index =0;
		while(p1<n && p2<m) {
			if(arr1[p1]<=arr1[p2]) {
				arr3[index]=arr1[p1];
				p1++;
			}
			else {
				arr3[index]=arr2[p2];
				p2++;
			}
			index++;
		}
		while(p1<n) {
			arr3[index++] = arr1[p1++];
		}
		while(p2<m) {
			arr3[index++] = arr2[p2++];
		}
		
		return arr3;
	}

	private static int[] mergeSortArray(int[] arr1, int[] arr2, int n, int m) {
		int[] arr3 = new int[n+m];
		int index = 0;
		for(int i=0;i<n;i++) {
			arr3[index]=arr1[i];
			index++;
		}
		for(int j =0 ;j<m;j++) {
			arr3[index]=arr2[j];
			index++;
		}
		Arrays.sort(arr3);
		return arr3;
	}

}
