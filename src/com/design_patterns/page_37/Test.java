package com.design_patterns.page_37;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(99, 11, 22);
		weatherData.setMeasurements(88, 33, 44);
		weatherData.setMeasurements(77, 55, 66);
	}

}
