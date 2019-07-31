package com.llf.javaTest.threadTest.readWriteLock;

public class dataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Data data = new Data();
		for (int i = 0; i < 5; i++) {
		    new Thread(new Runnable() {
		        @Override
		        public void run() {
		            data.readData();
		        }
		    }).start();
		}

		Thread write = new Thread(new Runnable() {
		    @Override
		    public void run() {
		       data.writeData("update data");
		    }
		});
		write.start();
	}

}
