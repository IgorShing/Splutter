package com.material.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	/**
	 * Attaches observers to the subject.
	 *
	 * @param observer
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}

	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
