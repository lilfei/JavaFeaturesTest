package com.design_patterns.page_37;

import java.util.ArrayList;

public class WeatherData implements ISubject {

	private ArrayList<IObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i = 0; i< observers.size(); i++){
			IObserver observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
}
