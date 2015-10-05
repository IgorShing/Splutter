package com.material.patterns.interceptingfilter;

public class AuthenticationFilter implements Filter {

	@Override
	public void execute(Request request) {
		System.out.println("Authenticating for the request: " + request.getViewName());
	}
}
