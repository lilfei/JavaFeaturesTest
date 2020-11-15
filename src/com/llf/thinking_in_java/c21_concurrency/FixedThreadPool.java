package com.llf.thinking_in_java.c21_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exec.execute(new LightOff());
		}
		exec.shutdown();
	}

}
