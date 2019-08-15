package com.llf.javaTest.enumTest;

public enum TrafficLamp {

	RED(30) {
		public TrafficLamp nextLamp() {
			return GREEN;
		}
	},
	GREEN(40) {
		public TrafficLamp nextLamp() {
			return YELLOW;
		}
	},
	YELLOW(5) {
		public TrafficLamp nextLamp() {
			return RED;
		}
	};

	public abstract TrafficLamp nextLamp();

	private int time;

	private TrafficLamp(int time) {
		this.time = time;
	}

	public int getTime() {
		return time;
	}
}
