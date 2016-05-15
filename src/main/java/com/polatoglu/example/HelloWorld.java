package com.polatoglu.example;

public class HelloWorld {
	public static void main(String[] args) {
		
		String output = new HelloWorld().getHelloWorld();
		
		System.out.println(output);
	}
	
	public String getHelloWorld(){
		return "Hello World!!";
	}
}
