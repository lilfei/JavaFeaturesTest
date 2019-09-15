package com.llf.spider.utils;

import java.util.Random;

/**
 * 生成随机枚举值
 * @author Administrator
 *
 */
public class RandomEnum {

	// 生成种子
	private static int random = (int) (Math.random() * 100);
	private static Random rand = new Random(random);

	public static <T extends Enum<T>> T random(Class<T> enumClazz) {
		return random(enumClazz.getEnumConstants());
	}

	public static <T> T random(T[] values) {
		return values[rand.nextInt(values.length)];
	}

}
