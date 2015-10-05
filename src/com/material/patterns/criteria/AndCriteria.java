package com.material.patterns.criteria;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		// Apply the first criteria
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);

		// Apply the second criteria
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
