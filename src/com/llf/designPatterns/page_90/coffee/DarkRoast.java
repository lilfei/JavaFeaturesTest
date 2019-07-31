package com.llf.designPatterns.page_90.coffee;

import com.llf.designPatterns.page_90.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return .99;
	}

}
