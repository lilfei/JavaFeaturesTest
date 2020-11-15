package com.llf.thinking_in_java.c15_type_info;

/**
 * 想使用T类型标签，可以用.newInstance()创建这个类型的新对象
 * 
 * @author llf
 * @date 2020年11月11日
 * @param <T>
 */
class ClassAsFactory<T> {
	T t;

	public ClassAsFactory(Class<T> kind) {
		try {
			t = kind.newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}

class Employee {

}

/**
 * 这里ClassAsFactory<Integer>对象失败是因为Integer没有默认构造器
 * 
 * @author llf
 * @date 2020年11月11日
 */
public class P664 {

	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {
			System.out.println("ClassAsFactory<Integer> failed");
		}
	}

}
