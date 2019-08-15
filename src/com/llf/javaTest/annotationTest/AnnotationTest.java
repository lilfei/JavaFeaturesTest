package com.llf.javaTest.annotationTest;

import java.util.Arrays;

/**
 * 如果只有value属性，可以不写“value=”
 * 如果数组中元素只有一个，可以不加大括号
 * @author Administrator
 *
 */
@MyAnnotation(color = "red", value = "abc", intArray = { 1, 2, 3 })
public class AnnotationTest {

	@MyAnnotation("cde")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (AnnotationTest.class.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = (MyAnnotation) AnnotationTest.class.getAnnotation(MyAnnotation.class);
			System.out.println(annotation);
			System.out.println(annotation.color());
			System.out.println(annotation.value());
			System.out.println(Arrays.toString(annotation.intArray()));
		}
	}

}
