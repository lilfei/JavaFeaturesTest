package com.design_patterns.page_2.ducks;

import com.design_patterns.page_2.fly_behavior.IFlyBehavior;
import com.design_patterns.page_2.quack_behavior.IQuackBehavior;

public abstract class Duck {
	
	public Duck() {
	}
	
	IFlyBehavior flyBehavior;
	
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	IQuackBehavior quackBehavior;
	
	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void fly() {
		flyBehavior.fly();
	}

	public void quack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("Duck swim...");
	}
	
	public abstract void display();
}
