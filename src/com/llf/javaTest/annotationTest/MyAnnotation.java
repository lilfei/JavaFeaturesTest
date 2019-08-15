package com.llf.javaTest.annotationTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 元注解,共三种,默认为SOURCE RetentionPolicy.SOURCE RetentionPolicy.CLASS
 * RetentionPolicy.RUNTIME
 * 
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface MyAnnotation {
	String color() default "blue";

	String value();

	int[] intArray() default { 3, 4, 5 };
	
	// todo 添加枚举类型
	
	// todo 添加注解类型
}
