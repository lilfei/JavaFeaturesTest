package com.llf.javaTest;

public class NullVulueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		if (a != null && a.equals("haha")) {
			System.out.println("not null");
		}

		if (a == null) {
			System.out.println("null");
		}

		System.out.println("final a is null");

	}

}
