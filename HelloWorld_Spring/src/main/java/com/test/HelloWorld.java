package com.test;

public class HelloWorld {
	
	
	public HelloWorld(){
		
		System.out.println("inside constructor");
	}
	private String name;
	public void setName(String name) {
		System.out.println("setter method called");
		this.name = name;
	}
	public void printHello(){
		System.out.println("Hello !"+name);
	}

}
