package com.llf.thinking_in_java;

class Poppet {
	private int i;

	Poppet(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Poppet [i=" + i + "]";
	}

}

/**
 * 空白final
 * @author llf
 * @date 2020年11月8日
 */
public class P265_final_blank {

	private final int i = 0;
	private final int j;

	private final Poppet p;

	public P265_final_blank() {
		j = 1;
		p = new Poppet(1);
	}

	public P265_final_blank(int x) {
		j = x;
		p = new Poppet(x);
	}

	@Override
	public String toString() {
		return "Page265_final_blank [i=" + i + ", j=" + j + ", p=" + p + "]";
	}

	public static void main(String[] args) {
		P265_final_blank p1 = new P265_final_blank();

		P265_final_blank p2 = new P265_final_blank(47);

		System.out.println(p1);
		System.out.println(p2);
	}

}
