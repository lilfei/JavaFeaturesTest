package com.llf.designPatterns.page_2.fly_behavior.impl;

import com.llf.designPatterns.page_2.fly_behavior.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("FlyWithWings fly..");
	}

}
