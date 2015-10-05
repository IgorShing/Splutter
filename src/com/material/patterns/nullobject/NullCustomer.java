package com.material.patterns.nullobject;

public class NullCustomer extends AbstractCustomer{

	private static final String NAME_NOT_AVAILABLE = "Not Available in Customer Database";

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return NAME_NOT_AVAILABLE;
	}

}
