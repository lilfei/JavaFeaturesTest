package com.llf.javaTest;

public class RegexUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reg = "10\n23";
		String b = reg.replaceAll("\n", "");
		System.out.println(b.length());
		System.out.println(b);
		System.out.println(Integer.valueOf(b));
	}

}
