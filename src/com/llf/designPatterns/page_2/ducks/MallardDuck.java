package com.llf.designPatterns.page_2.ducks;

import com.llf.designPatterns.page_2.fly_behavior.impl.FlyWithWings;
import com.llf.designPatterns.page_2.quack_behavior.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Green Head");
	}

}
