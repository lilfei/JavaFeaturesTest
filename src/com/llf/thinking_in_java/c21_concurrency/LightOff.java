package com.llf.thinking_in_java.c21_concurrency;

public class LightOff implements Runnable {

	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LightOff() {

	}

	public LightOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LightOff!") + "), ";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			Thread.yield();
		}
	}

}
