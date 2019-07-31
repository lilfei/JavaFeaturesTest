package com.llf.javaTest.threadTest.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Data {
    private String mData = "data";
    private ReentrantLock mLock = new ReentrantLock();

    public String readData(){
        mLock.lock();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("read data : " + mData);
        String data = mData;
        mLock.unlock();
        return data;
    }

    public void writeData(String data){
        mLock.lock();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mData = data;
        System.out.println("write data : " + mData);
        mLock.unlock();
    }
}
