import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Hello {

	public static void main(String[] args) {

		Timer timer = new Timer();

		// // 前一次执行程序结束后 2000ms 后开始执行下一次程序
		// timer.schedule(new TimerTask() {
		// @Override
		// public void run() {
		// System.out.println("IMP 当前时间" + this.scheduledExecutionTime());
		// }
		// }, 0, 2000);

		// 前一次程序执行开始 后 2000ms后开始执行下一次程序
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
