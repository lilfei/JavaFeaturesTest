
public class StaticAndThreadTest extends Thread {

	public volatile static int n;

	public StaticAndThreadTest() {
		Thread td = new Thread(this);
		td.start();
	}

	public synchronized void run() {
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
