package com.design_patterns.page_90.coffee;

import com.design_patterns.page_90.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
