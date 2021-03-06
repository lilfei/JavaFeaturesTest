package com.llf.javaTest.singleton;

/*
 * 饱汉模式(懒汉模式)--线程安全
 * 优点：同上，但加锁了。
 * 缺点：synchronized 为独占排他锁，并发性能差。即使在创建成功以后，获取实例仍然是串行化操作。
 */
public class Singleton2 {

	/**
	 * 定义一个变量来存储创建好的类实例
	 */
	private static Singleton2 uniqueInstance = null;

	/**
	 * 私有化构造方法，好在内部控制创建实例的数目
	 */
	private Singleton2() {
	}

	/**
	 * 定义一个方法来为客户端提供类实例
	 * 
	 * @return 一个Singleton的实例
	 */
	public static synchronized Singleton2 getInstance() {
		// 判断存储实例的变量是否有值
		if (uniqueInstance == null) {
			// 如果没有，就创建一个类实例，并把值赋值给存储类实例的变量
			uniqueInstance = new Singleton2();
		}
		// 如果有值，那就直接使用
		return uniqueInstance;
	}

	/**
	 * 示意方法，单例可以有自己的操作
	 */
	public void singletonOperation() {

		// 功能处理

	}

	/**
	 * 示意属性，单例可以有自己的属性
	 */
	private String singletonData;

	/**
	 * 示意方法，让外部通过这些方法来访问属性的值
	 * 
	 * @return 属性的值
	 */
	public String getSingletonData() {
		return singletonData;
	}
}
