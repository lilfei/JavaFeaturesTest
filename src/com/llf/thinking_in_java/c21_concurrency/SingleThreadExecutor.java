package com.llf.thinking_in_java.c21_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单一线程，顺序执行任务
 * @author llf
 * @date 2020年11月14日
 */
public class SingleThreadExecutor {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			exec.execute(new LightOff());
		}
		exec.shutdown();
	}

}
