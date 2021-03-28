package com.llf.javaTest.weakReference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class Client3 {
	public static void main(String[] args) {
		Apple apple = new Apple("虚苹果");
		ReferenceQueue<Apple> referenceQueue = new ReferenceQueue<>();
	    PhantomReference<Apple> phantomReference = new PhantomReference<>(apple, referenceQueue);
	    // 一直返回null，PhantomReference的get()结果必定为null
	    System.out.println("phantomReference.get() = " + phantomReference.get());
	    Reference<?> reference;
	    while ((reference = referenceQueue.poll()) != null) {
	    	if (reference.equals(phantomReference)) {
	    		System.out.println("被回收了");
	        }
	    }
	}
}
