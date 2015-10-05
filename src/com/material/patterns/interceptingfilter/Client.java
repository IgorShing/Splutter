package com.material.patterns.interceptingfilter;

public class Client {

	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager){
		this.filterManager = filterManager;
	}

	public void sendRequest(Request request){
		filterManager.filterRequest(request);
	}
}
