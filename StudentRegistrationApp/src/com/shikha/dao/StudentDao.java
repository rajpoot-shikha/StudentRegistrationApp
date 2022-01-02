package com.shikha.dao;

import java.util.ArrayList;

import com.shikha.model.Student;

public interface StudentDao {

  public void addStudents(ArrayList<Student> studentList);
  public ArrayList<Student> getStudents();

}
