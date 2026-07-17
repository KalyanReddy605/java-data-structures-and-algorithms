package com.arrays;


public class PairsInAnArray {

	public static void main(String[] args) {
		
       int[] a = {2,3,4,2,3,8,19};
       
       for(int i=0;i<a.length;i++) {
    	   for(int j =i+1;j<a.length;j++) {
    		   System.out.print("("+a[i]+","+a[j]+")");
    	   }
    	   System.out.println();
       }
       
       
	}

}
