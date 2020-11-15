package com.llf.thinking_in_java.c21_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 线程休眠
 * @author llf
 * @date 2020年11月14日
 */
public class SleepingTask extends LightOff {

	@Override
	public void run() {
		while (countDown-- > 0) {
			try {
				System.out.println(status());
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new SleepingTask());
		}
		exec.shutdown();
	}

}
