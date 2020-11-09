package com.llf.thinking_in_java.c10_inner_class;

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class P348 {

	private Object[] items;
	private int next = 0;

	public P348(int i) {
		items = new Object[i];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}

	// 内部类可以访问外部private成员items
	private class P348Selector implements Selector {

		private int i = 0;

		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length)
				i++;
		}

	}

	public Selector selector() {
		return new P348Selector();
	}

	public static void main(String[] args) {
		P348 p348 = new P348(10);
		for (int i = 0; i < 10; i++) {
			p348.add(Integer.toString(i));
		}
		Selector selector = p348.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}

}
