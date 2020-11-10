package com.llf.javaTest;

import java.util.Arrays;

public class StringArrayTest {

	public static void main(String[] args) {
		String[] abc = { "a", "b", "c", "d", "e", "f", "g" };
		System.out.println("length: " + abc.length);
		System.out.println("Arrays.asList: " + Arrays.asList(abc));

		String str1 = "haha123";
		String str2 = "haha123";
		String str3 = new String(str1);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str2);
	}

}
