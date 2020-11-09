package com.llf.thinking_in_java.c8_polymorphism;

import static com.llf.print.Print.*;

class Glyph {
	void draw() {
		print("Glyph draw");
	}

	Glyph() {
		print("Glyph before draw");
		draw();
		print("Glyph after draw");
	}
}

/**
 * 当覆盖基类方法时，会在子类构造执行前先执行覆盖的构造方法
 * @author llf
 * @date 2020年11月8日
 */
class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph, radius = " + radius + ", r = " + r);
	}

	void draw() {
		print("RoundGlyph.draw, radius = " + radius);
	}
	
	void draw1() {
		print("RoundGlyph.draw1, radius = " + radius);
	}
}

public class P301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoundGlyph r1 = new RoundGlyph(5);
		r1.draw();
	}

}
