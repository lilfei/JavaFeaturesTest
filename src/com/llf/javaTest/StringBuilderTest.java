package com.llf.javaTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		System.out.println("builder is: " + builder.toString());
		System.out.println("builder length: " + builder.length());
		System.out.println("builder equals \"\": "+ builder.toString().equals(""));
		builder.append("a") ;
		System.out.println("builder is: " + builder.toString());
		System.out.println("builder length: " + builder.length());
		System.out.println("builder equals \"\": "+ builder.toString().equals(""));
	}

}
