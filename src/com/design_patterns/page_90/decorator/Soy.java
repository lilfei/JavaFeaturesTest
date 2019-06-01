package com.design_patterns.page_90.decorator;

import com.design_patterns.page_90.Beverage;
import com.design_patterns.page_90.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage; 
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
