package com.collections.ArrayList;

import java.util.Arrays;

public class CustoArrayList {
	Object[] a = null;
	int index = 0;

	public CustoArrayList(int size) {
		a = new Object[size];
	}

	public CustoArrayList() {
		a = new Object[10];
	}
	
	@Override
    public String toString() {
        String array = "[";

        for (int i = 0; i < index; i++) {
            array += a[i];
            if (i < index - 1) {
                array += ", ";
            }
        }

        array += "]";
        return array;
    }

	public void add(Object element) {
		if (index >= a.length) {
			
			int newLength = a.length+(a.length/2);
			
			a = Arrays.copyOf(a,newLength);
			
//			Object[] array = new Object[newLength];
//			
//			for(int i =0;i<a.length;i++) {
//				array[i] = a[i];
//			}
//			
//			a = array;
		}
			a[index] = element;
			index++;
	}

}
