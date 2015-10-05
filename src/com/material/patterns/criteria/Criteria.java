package com.material.patterns.criteria;

import java.util.List;

public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
