package com.material.patterns.tranferobject;

import com.material.logic.Demo;

public class TransferObjectPatternDemo implements Demo {

	public static final String NAME = "Transfer Object Pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		StudentBusinessObject studentBusinessObject = new StudentBusinessObject();

		// Print all students
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo : "
					+student.getRollNo()+", Name : "+student.getName()+" ]");
		}

		// Update student
		StudentVO student =studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);

		// Get the student
		studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : "
				+student.getRollNo()+", Name : "+student.getName()+" ]");
	}

}
