package com.design_patterns.page_37;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

	private float temperature;
	private float humidity;
	private ISubject weatherData;
	
	public CurrentConditionsDisplay(ISubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrentConditionsDisplay: " + temperature + ", " + humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
