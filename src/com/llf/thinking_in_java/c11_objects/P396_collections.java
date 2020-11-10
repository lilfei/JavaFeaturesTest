package com.llf.thinking_in_java.c11_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P396_collections {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts1 = { 6, 7, 8, 9, 10 };
		Integer[] moreInts2 = { 16, 17, 18, 19, 20 };
		collection.addAll(Arrays.asList(moreInts1));
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts2);

		List<Integer> list = Arrays.asList(21, 22, 23, 24, 25);
		list.set(1, 99);
		for (Integer i : collection) {
			System.out.println(i);
		}
	}

}
