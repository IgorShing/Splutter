package com.material.patterns.observer;

public class HexaObserver extends Observer {

	private Subject subject;

	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Hexa String: "
				+ Integer.toHexString( subject.getState() ) );
	}

}
