package com.material.patterns.interceptingfilter;

public class Request {

	private String viewName;

	public Request(String viewName) {
		this.viewName = viewName;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
}
