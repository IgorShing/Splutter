package com.material.patterns.frontcontroller;

public class FrontController {

	private Dispatcher dispatcher;

	public FrontController(){
		dispatcher = new Dispatcher();
	}

	private boolean isAuthenticUser(){
		System.out.println("User is authenticated successfully.");
		return true;
	}

	private void trackRequest(Request request){
		System.out.println("Page requested: " + request.getViewName());
	}

	public void dispatchRequest(Request request){
		//log each request
		trackRequest(request);

		//authenticate the user
		if(isAuthenticUser()){
			dispatcher.dispatch(request);
		}
	}

}
