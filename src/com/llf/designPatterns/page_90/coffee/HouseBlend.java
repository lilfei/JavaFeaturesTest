package com.llf.designPatterns.page_90.coffee;

import com.llf.designPatterns.page_90.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
