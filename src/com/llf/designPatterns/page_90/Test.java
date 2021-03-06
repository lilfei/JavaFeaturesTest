package com.llf.designPatterns.page_90;

import com.llf.designPatterns.page_90.coffee.DarkRoast;
import com.llf.designPatterns.page_90.coffee.Espresso;
import com.llf.designPatterns.page_90.decorator.Mocha;
import com.llf.designPatterns.page_90.decorator.Soy;
import com.llf.designPatterns.page_90.decorator.Whip;

public class Test {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new DarkRoast();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
