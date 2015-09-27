package com.material.patterns.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Console logger. " + level + ": " + message);

	}
}
