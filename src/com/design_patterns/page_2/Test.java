package com.design_patterns.page_2;

import com.design_patterns.page_2.ducks.Duck;
import com.design_patterns.page_2.ducks.MallardDuck;

/**
 * 策略模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.fly();
		mallard.quack();
	}

}
