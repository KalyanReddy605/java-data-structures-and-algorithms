package com.designpatterns;

public class TestSingletonDesignPattern {

	public static void main(String[] args) {
//		SingletonDesignPattern s = new SingletonDesignPattern();
//		SingletonDesignPattern s1 = new SingletonDesignPattern();
		
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
		System.out.println(SingletonDesignPattern.getInstance().hashCode());
		System.out.println(SingletonDesignPattern.getInstance().hashCode());

	}

}
