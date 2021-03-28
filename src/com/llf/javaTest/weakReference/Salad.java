package com.llf.javaTest.weakReference;

import java.lang.ref.WeakReference;

public class Salad extends WeakReference<Apple> {
	public Salad(Apple apple) {
		super(apple);
	}
}
