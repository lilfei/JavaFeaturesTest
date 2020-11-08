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

public class UpCastingTest extends Instrument {

	public static void main(String[] args) {
		UpCastingTest flute = new UpCastingTest();
		Instrument.tune(flute);
	}

}
