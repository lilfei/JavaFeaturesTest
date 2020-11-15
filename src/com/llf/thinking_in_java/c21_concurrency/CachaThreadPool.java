package com.llf.thinking_in_java.c21_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executor可以管理线程生命周期
 * @author llf
 * @date 2020年11月14日
 */
public class CachaThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new LightOff());
		}
		exec.shutdown();
	}

}
