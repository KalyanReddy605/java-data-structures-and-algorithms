package com.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoNumber {
	public static void main(String[] args) {
		int [] nums1 = new int[] {1,2,2,1}; 
		int [] nums2 =new int[] {2,2};
		int[] intersection = intersection(nums1,nums2);
		System.out.println(intersection);
		
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		 Arrays.sort(nums1);
	     Arrays.sort(nums2);
		int len1 = nums1.length ;
		int len2 = nums2.length ;
		
		int i = 0, j = 0;
		List<Integer> num = new ArrayList<>();
		while (i < len1 && j < len2) {
			if (nums1[i] == nums2[j]) {
				num.add(i);
				i++;
				j++;
			} else {
				i++;
				j++;
			}
		}
		int[] result = new int[num.size()];
		for (int k = 0; k < num.size(); k++) {
			result[k] = num.get(k);
		}
		return result;
	}

}
