package com.llf.thinking_in_java.c21_concurrency;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String> {

	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of TaskWithResult " + id;
	}

}

/**
 * 任务完成时可以返回一个值，要用一个Callable的实现
 * 并使用ExecutorService.submit()调用
 * @author llf
 * @date 2020年11月14日
 */
public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 5; i++) {
			results.add(exec.submit(new TaskWithResult(i)));
		}
		for (Future<String> fs : results) {
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			} finally {
				exec.shutdown();
			}

		}
	}

}
