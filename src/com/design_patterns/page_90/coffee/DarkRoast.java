package com.design_patterns.page_90.coffee;

import com.design_patterns.page_90.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return .99;
	}

}
