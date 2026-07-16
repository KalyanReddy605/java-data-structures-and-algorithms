package com.designpatterns;

public class SingletonDesignPattern {
// Eager Initialization
//	static SingletonDesignPattern s = new SingletonDesignPattern();
	
// Lazy Initialization
	static SingletonDesignPattern s = null;
	static SingletonDesignPattern getInstance() {
		if(s==null) {
			 s = new SingletonDesignPattern();
		}
		return s;
	}

}
