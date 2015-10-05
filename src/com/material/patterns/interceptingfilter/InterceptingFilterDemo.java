package com.material.patterns.interceptingfilter;

import com.material.logic.Demo;

public class InterceptingFilterDemo implements Demo {

	public static final String NAME = "Intercepting filter pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {

		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);

		client.sendRequest(new Request("HOME"));
	}
}
