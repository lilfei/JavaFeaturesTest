package com.llf.thinking_in_java.c15_type_info;

public class CountedObject {
	private static long counter = 0;
	private final long id = counter++;

	public long id() {
		return id;
	}

	public String toString() {
		return "CounterObject: " + id;
	}
}
