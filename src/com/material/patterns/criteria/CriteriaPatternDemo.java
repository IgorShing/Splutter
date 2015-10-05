package com.material.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

import com.material.logic.Demo;

public class CriteriaPatternDemo implements Demo {

	public static final String NAME = "Criteria/Filter pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John","Male", "Married"));
		persons.add(new Person("Laura","Female", "Married"));
		persons.add(new Person("Diana","Female", "Single"));
		persons.add(new Person("Mike","Male", "Single"));
		persons.add(new Person("Bobby","Male", "Single"));

		Criteria criteria = new CriteriaMale();

		List<Person> malePersons = criteria.meetCriteria(persons);
		System.out.println("Males:");
		printPersons(malePersons);

		criteria = new CriteriaFemale();

		List<Person> femalePersons = criteria.meetCriteria(persons);
		System.out.println("Females:");
		printPersons(femalePersons);


		System.out.println("Males single:");
		// Apply two filters
		Criteria criteriaMale = new CriteriaMale();
		Criteria criteriaSingle = new CriteriaSingle();
		Criteria criteriaMaleSingle = new AndCriteria(criteriaSingle, criteriaMale);

		List<Person> maleSinglePersons = criteriaMaleSingle.meetCriteria(persons);

		printPersons(maleSinglePersons);



		// Apply OR criteria
		System.out.println("Female or single persons:");
		Criteria criteriaFemale = new CriteriaFemale();
		Criteria criteriaFemaleOrSingle = new OrCriteria(criteriaSingle, criteriaFemale);

		List<Person> femaleOrSinglePersons = criteriaFemaleOrSingle.meetCriteria(persons);

		printPersons(femaleOrSinglePersons);

	}

	/**
	 * Shows persons.
	 *
	 * @param persons
	 */
	public void printPersons(List<Person> persons){
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName()
					+", Gender : " + person.getGender()
					+", Marital Status : " + person.getMaritalStatus()
					+" ]");
		}
	}
}
