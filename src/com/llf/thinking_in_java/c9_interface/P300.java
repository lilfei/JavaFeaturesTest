package com.llf.thinking_in_java.c9_interface;

interface I1{
	void f();
}

interface I2{
	int f(int i);
}

interface I3{
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1,I2{

	@Override
	public int f(int i) {
		return 1;
	}

	@Override
	public void f() {
		
	}
	
}

class C3 extends C implements I2{

	@Override
	public int f(int i) {
		return 1;
	}
	
}

class C4 extends C implements I3{
	public int f() {
		return 1;
	}
}

/**
 * 不同的接口中使用不同的函数名称，
 * 不然会造成代码可读性的混乱
 * @author llf
 * @date 2020年11月9日
 */
public class P300 {

	public static void main(String[] args) {

	}

}
