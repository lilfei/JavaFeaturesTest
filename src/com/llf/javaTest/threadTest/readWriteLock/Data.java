package com.llf.javaTest.threadTest.readWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Data {
	private String mData = "data";
	private ReadWriteLock mLock = new ReentrantReadWriteLock();
	private Lock mReadLock = mLock.readLock();
	private Lock mWriteLock = mLock.writeLock();

	public String readData() {
		mReadLock.lock();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String data = mData;
		System.out.println("read data : " + mData);
		mReadLock.unlock();
		return data;
	}

	public void writeData(String data) {
		mWriteLock.lock();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("write data : " + mData);
		mData = data;
		mWriteLock.unlock();
	}
}
