package com.linkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		SingleLinkedList s = new SingleLinkedList();
		s.insertValue(10);
		s.insertValue(20);
		s.insertValue(30);
		s.insertValue(40);
		s.insertLast(5);
		s.insertLast(7);
		s.insert(3,34);
		s.display();
		System.out.println();
		System.out.println(s.deleteFirst());
		s.display();
		System.out.println();
		System.out.println(s.size());
		

	}

}
