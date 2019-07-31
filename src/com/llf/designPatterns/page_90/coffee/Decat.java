package com.llf.designPatterns.page_90.coffee;

import com.llf.designPatterns.page_90.Beverage;

public class Decat extends Beverage {

	public Decat() {
		this.description = "Decat Coffee";
	}

	@Override
	public double cost() {
		return .79;
	}

}
