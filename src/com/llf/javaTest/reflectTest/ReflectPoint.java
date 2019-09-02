package com.llf.javaTest.reflectTest;

public class ReflectPoint {
	private int x;
	public int y;
	public String str1 = "haha";
	public String str2 = "hehe";
	public String str3 = "lala";

	public ReflectPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "ReflectPoint [x=" + x + ", y=" + y + ", str1=" + str1 + ", str2=" + str2 + ", str3=" + str3 + "]";
	}

}
