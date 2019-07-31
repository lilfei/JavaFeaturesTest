package com.llf.javaTest.threadTest;

public class StaticAndThreadTest extends Thread {

	public volatile static int n;
	public volatile static Thread th1;

	// 线程唯一
	public StaticAndThreadTest() {
		synchronized (this) {
			if (th1 == null) {
				th1 = new Thread(this);
				th1.start();
			}
		}
	}

	@Override
	public void run() {
		for (n = 0; n < 6; n++) {
			try {
				System.out.print(n);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.print("Exception");
			}
		}
	}

	public static void main(String[] args) {
		new StaticAndThreadTest();
		new StaticAndThreadTest();
	}

}
