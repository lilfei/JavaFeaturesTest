package com.llf.thinking_in_java.c15_type_info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruit {

}

class Apple extends Fruit {

}

class Jonathan extends Apple {

}

class Orange extends Fruit {

}

public class CovariantArrays {

	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		try {
			fruit[0] = new Fruit();
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			fruit[0] = new Orange();
		} catch (Exception e) {
			System.out.println(e);
		}

		// 以下代码有问题
		List<? extends Fruit> fruit1 = new ArrayList<Apple>();
		fruit1.add(null);
		Fruit f1 = fruit1.get(0);
		System.out.println(f1);

		List<? extends Fruit> fruit2 = Arrays.asList(new Apple());
		Apple a1 = (Apple) fruit2.get(0);
		System.out.println(fruit2.contains(new Apple()));
		System.out.println(fruit2.indexOf(new Apple()));
	}

}
