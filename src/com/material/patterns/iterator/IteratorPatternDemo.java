package com.material.patterns.iterator;

import com.material.logic.Demo;

public class IteratorPatternDemo implements Demo {

	public static final String NAME = "Iterator pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		NameRepository namesRepository = new NameRepository();

		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		}
	}

}
