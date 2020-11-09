package com.llf.thinking_in_java.c10_inner_class;

public class P350 {

	void f() {
		System.out.println("inner.f()");
	}

	public class Inner {
		// 此处this指Inner类，P350.this指外部类
		// 使用P350.this可以减少内部开销
		public P350 outer() {
			System.out.println("P350.this : " + P350.this.hashCode());
			System.out.println("this : " + this.hashCode());
			return P350.this;
		}
	}

	public Inner inner() {
		return new Inner();
	}

	/**
	 * 可以在.之后使用new
	 * 这时会使用同一个p350对象
	 * @param args
	 */
	public static void main(String[] args) {
		P350 p350 = new P350();
		P350.Inner p350_inner1 = p350.inner();
		P350.Inner p350_inner2 = p350.new Inner();
		p350_inner1.outer().f();
		p350_inner2.outer().f();
	}

}
