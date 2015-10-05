package com.material.patterns.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;

	public void addFilter(Filter filter){
		filters.add(filter);
	}

	public void setTarget(Target target){
		this.target = target;
	}

	public void execute(Request request){

		// Process the request by the filters first
		for (Filter filter : filters) {
			filter.execute(request);
		}

		// Now process the request by the target
		target.execute(request);
	}
}
