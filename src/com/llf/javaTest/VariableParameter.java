package com.llf.javaTest;

public class VariableParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1, 3));
		System.out.println(add(1, 2, 2));
	}

	public static int add(int x, int... args) {
		int sum = x;
		for (int i : args) {
			sum += i;
		}
		return sum;
	}

}
