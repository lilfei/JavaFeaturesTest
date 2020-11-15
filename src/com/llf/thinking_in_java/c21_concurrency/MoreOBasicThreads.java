package com.llf.thinking_in_java.c21_concurrency;

public class MoreOBasicThreads {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new LightOff()).start();
		}
		System.out.println("Waiting for LightOff");
	}

}
