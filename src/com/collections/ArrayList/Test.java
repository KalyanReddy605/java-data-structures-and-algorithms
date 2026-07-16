package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
//		CustoArrayList array = new CustoArrayList(5);
//		array.add(10);
//		array.add(20);
//		System.out.println(array);
		
		ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
		arrays.add(new ArrayList<>(Arrays.asList(1, 3, 3, 4, 4)));
		arrays.add(new ArrayList<>(Arrays.asList(1 , 4, 4)));
		arrays.add(new ArrayList<>(Arrays.asList(1, 3, 9, 4)));
		System.out.println(arrays.get(5));
		for(int i =0;i<arrays.size();i++) {
			for(int j =0 ;j<arrays.get(i).size();i++) {
				
			}
		}
	}

}
