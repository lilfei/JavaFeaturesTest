package com.llf.javaTest.reflectTest;

import java.lang.reflect.Field;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
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

		ReflectPoint pt1 = new ReflectPoint(3, 5);
		Field fieldY = pt1.getClass().getField("y");
		System.out.println(fieldY.get(pt1));

		// private私有变量要用getDeclaredField
		Field fieldX = pt1.getClass().getDeclaredField("x");
		// 并且使用setAccessible为true强制获取
		fieldX.setAccessible(true);
		System.out.println(fieldX.get(pt1));

		changeStringValue(pt1);
		System.out.println(pt1.toString());
	}

	private static void changeStringValue(Object obj) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Field[] fields = obj.getClass().getFields();
		for (Field field : fields) {
			if (field.getType() == String.class) {
				String oldValue = (String) field.get(obj);
				String newValue = oldValue.replaceAll("h", "b");
				field.set(obj, newValue);
			}
		}
	}

}
