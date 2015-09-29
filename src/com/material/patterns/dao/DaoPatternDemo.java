package com.material.patterns.dao;

import com.material.logic.Demo;

public class DaoPatternDemo implements Demo {

	private static final String	NAME	   = "Dao pattern";
	private StudentDao	        studentDao	= new StudentDaoImpl();

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo()
					+ ", Name : " + student.getName() + " ]");
		}

		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		student = studentDao.getAllStudents().get(1);
		if (student != null) {
			student.setName("Peter");
		}
		studentDao.updateStudent(student);

		// Get the student
		System.out.println("Student: [RollNo : " + student.getRollNo()
				+ ", Name : " + student.getName() + " ]");
	}

}
