package com.llf.thinking_in_java.c13_strings;

import java.util.ArrayList;
import java.util.List;

public class P509 {

	/**
	 * 这里想打印自身要用super.toString,不能使用this
	 * this会在+后面默认调用toString
	 * 就会造成递归，然后报错
	 */
	public String toString() {
		return "P509 address " + super.toString() + "\n";
	}

	public static void main(String[] args) {
		List<P509> v = new ArrayList<P509>();
		for (int i = 0; i < 10; i++) {
			v.add(new P509());
		}
		System.out.println(v);

	}

}
