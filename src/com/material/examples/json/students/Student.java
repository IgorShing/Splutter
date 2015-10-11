package com.material.examples.json.students;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	// @JsonIgnore
	@JsonProperty("StudentName")
	private String	name;

	// @JsonIgnore
	@JsonProperty(value = "StudentAge", required = true)
	private int	   age;

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [ name: " + name + ", age: " + age + " ]";
	}
}
