package com.design_patterns.page_90.coffee;

import com.design_patterns.page_90.Beverage;

public class Decat extends Beverage {

	public Decat() {
		this.description = "Decat Coffee";
	}

	@Override
	public double cost() {
		return .79;
	}

}
