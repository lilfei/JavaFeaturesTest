package com.design_patterns.page_37;

public interface ISubject {
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObservers();
}
