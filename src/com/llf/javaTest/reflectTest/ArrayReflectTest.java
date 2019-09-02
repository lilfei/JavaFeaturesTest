package com.llf.javaTest.reflectTest;

import java.lang.reflect.Array;

public class ArrayReflectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 1, 2, 3 };
		printObject(intArr);
		printObject("abc");
	}

	private static void printObject(Object obj) {
		// TODO Auto-generated method stub
		Class clazz = obj.getClass();
		if (clazz.isArray()) {
			int len = Array.getLength(obj);
			for (int i = 0; i < len; i++) {
				System.out.println(Array.get(obj, i));
			}
		} else {
			System.out.println(obj);
		}
	}

}
