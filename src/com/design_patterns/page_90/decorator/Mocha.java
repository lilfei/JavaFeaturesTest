package com.design_patterns.page_90.decorator;

import com.design_patterns.page_90.Beverage;
import com.design_patterns.page_90.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
