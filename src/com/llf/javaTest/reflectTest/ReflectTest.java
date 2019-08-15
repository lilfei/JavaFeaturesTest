package com.llf.javaTest.reflectTest;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String str = "abc";
		Class clz1 = str.getClass();
		Class clz2 = String.class;
		Class clz3 = Class.forName("java.lang.String");
		
		System.out.println(clz1 == clz2);
		System.out.println(clz1 == clz3);
		System.out.println(clz1.isPrimitive());
		System.out.println(int.class.isPrimitive());
		System.out.println(int.class == Integer.class);
		System.out.println(int.class == Integer.TYPE);
		System.out.println(int[].class.isPrimitive());
		System.out.println(int[].class.isArray());
	}

}
