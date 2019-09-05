package com.llf;

public class TestA {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("start work");
		while (!programIsOk(a)) {
			a = changeProgram(a);
		}
		System.out.println("finish work!");
	}

	private static int changeProgram(int a) {
		return ++a;
	}

	private static boolean programIsOk(int a) {
		if (a > 5) {
			System.out.println("program is OK!");
		} else {
			System.out.println("program is not OK!");
		}
		return a > 5;
	}

}
