package com.material.patterns.interceptingfilter;


/**
 * Performs the action of the request.
 * @author Igor_Shingaryov
 *
 */
public class Target {

	public void execute(Request request){
		System.out.println("Executing request: " + request.getViewName());
	}
}
