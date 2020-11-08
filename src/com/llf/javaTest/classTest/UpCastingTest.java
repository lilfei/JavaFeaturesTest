package com.llf.javaTest.classTest;

class Instrument {
	public void play() {
		System.out.println("instrument play");
	}

	static void tune(Instrument i) {
		System.out.println("instrument tune");
		i.play();
	}
}

/**
 * 向上转型测试，导出类可以含有更多的方法
 * 但它必须具备基类中所含有的方法
 * @author llf
 * @date 2020年11月8日
 */
public class UpCastingTest extends Instrument {

	public static void main(String[] args) {
		UpCastingTest flute = new UpCastingTest();
		Instrument.tune(flute);
	}

}
