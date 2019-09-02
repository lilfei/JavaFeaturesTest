package com.llf.javaTest.reflectTest;

import java.util.ArrayList;
import java.util.Collection;

public class ReflectTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collections = new ArrayList();
		ReflectPoint pt1 = new ReflectPoint(3,3);
		ReflectPoint pt2 = new ReflectPoint(4,4);
		ReflectPoint pt3 = new ReflectPoint(5,5);
		collections.add(pt1);
		collections.add(pt2);
		collections.add(pt3);
	}

}
