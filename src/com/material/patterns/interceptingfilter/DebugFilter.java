package com.material.patterns.interceptingfilter;

public class DebugFilter implements Filter {

	@Override
	public void execute(Request request) {
		System.out.println("Debug  for the request: " + request.getViewName());

	}

}
