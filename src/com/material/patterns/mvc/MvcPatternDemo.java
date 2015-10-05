package com.material.patterns.mvc;

import com.material.logic.Demo;

public class MvcPatternDemo implements Demo {

	public static final String NAME = "MVC pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		// Fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		//Create a view : to write student details on console
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();

		//update model data
		controller.setStudentName("John");
		controller.updateView();

	}


	private static Student retriveStudentFromDatabase(){
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
