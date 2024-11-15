package com.ibs.training.beans;

public class HelloWorld {

	private String message;
	
	public HelloWorld() {
		System.out.println("in constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		
		System.out.println("setter method ");
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println("Hello World "+message);
	}
	
}
