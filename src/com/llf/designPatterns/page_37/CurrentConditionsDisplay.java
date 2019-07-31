package com.llf.designPatterns.page_37;

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
		System.out.println("CurrentConditionsDisplay: " + temperature + ", " + humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
