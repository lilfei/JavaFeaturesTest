package com.llf.designPatterns.page_90;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
