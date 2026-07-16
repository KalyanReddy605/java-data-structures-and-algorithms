package com.linkedList;


public class SingleLinkedList {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public int size () {
		return this.size;
	}
	
	public void insertValue(int value) {
		
		Node node = new Node(value);
		
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}
	
	public void insertLast(int value) {
		
		if(tail == null) {
			insertValue(value);
			return ;
		}
		
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
		
	}
	
	public void insert(int index,int value){
		if(index == 0 ) {
			insertValue(value);
			return;
		}
		if(index == size) {
			insertLast(value);
			return;
		}
		Node temp = head;// index 0
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		//|value|nextNode Address|
		//temp.next not updated in argument
		Node node = new Node(value,temp.next);
		temp.next = node;
		size++;
	}
	
	public int deleteFirst() {
		
		int value = head.value;
		
		if(head == null) {
			tail = null;
		}
		head = head.next;
		size --;
		
		return value;
	}
	public void deleteLast() {
		if(tail == null) {
			return ;
		}
		
	}
	
	public void display() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.value+ "-->");
			temp  = temp .next;
		}
		System.out.print("END");
	}
	
	private class Node{
		
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value= value;
		}
		public Node(int value,Node next) {
			this.value = value;
			this.next = next;
		}
	}

}
