package com.llf.javaTest;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Hello {

	public static void main(String[] args) {

		Timer timer = new Timer();

		// // ǰһ��ִ�г�������� 2000ms ��ʼִ����һ�γ���
		// timer.schedule(new TimerTask() {
		// @Override
		// public void run() {
		// System.out.println("IMP ��ǰʱ��" + this.scheduledExecutionTime());
		// }
		// }, 0, 2000);

		// ǰһ�γ���ִ�п�ʼ �� 2000ms��ʼִ����һ�γ���
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				int a = randomAngle();
				if (a == 360 || a == 0) {
					System.out.println(a + "-----------");
					timer.cancel();
				} else {
					System.out.println(a);
				}
			}
		}, 0, 200);

	}

	public static int randomAngle() {
		int min = 1;
		int max = 360;
		Random random = new Random();
		return random.nextInt(max) % (max - min + 1) + min;
	}
}
