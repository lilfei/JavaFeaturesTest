package com.llf.designPatterns.page_90.decorator;

import com.llf.designPatterns.page_90.Beverage;
import com.llf.designPatterns.page_90.CondimentDecorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .30 + beverage.cost();
	}

}
