package com.shikha.service;

import java.util.ArrayList;

import com.shikha.model.Student;

public interface StudentService {
  public void addStudents(ArrayList<Student> students);
  public ArrayList<Student> getStudents();
  
}
