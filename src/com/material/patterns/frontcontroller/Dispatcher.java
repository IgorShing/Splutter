package com.material.patterns.frontcontroller;

public class Dispatcher {

	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher(){
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(Request request){

		if(request.getViewName().equalsIgnoreCase("STUDENT")){
			studentView.show();
		}else{
			homeView.show();
		}
	}
}
