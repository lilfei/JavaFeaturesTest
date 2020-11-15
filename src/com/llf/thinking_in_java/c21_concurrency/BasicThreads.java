package com.llf.thinking_in_java.c21_concurrency;

public class BasicThreads {

	public static void main(String[] args) {
		Thread t = new Thread(new LightOff());
		t.start();
		System.out.println("waiting for LightOff");
	}

}
