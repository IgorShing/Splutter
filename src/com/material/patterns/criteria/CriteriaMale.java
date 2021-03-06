package com.material.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	private static final String MALE = "MALE";

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();

		for (Person person : persons){
			if (person.getGender().equalsIgnoreCase(MALE)){
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
