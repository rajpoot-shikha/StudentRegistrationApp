package com.shikha.service;

import java.util.ArrayList;

import com.shikha.dao.StudentDao;
import com.shikha.factory.StudentDaoFactory;
import com.shikha.model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudents(ArrayList<Student> students) {
		StudentDaoFactory.getStudentDao().addStudents(students);
	}

	@Override
	public ArrayList<Student> getStudents() {
		return StudentDaoFactory.getStudentDao().getStudents();
	}
}
