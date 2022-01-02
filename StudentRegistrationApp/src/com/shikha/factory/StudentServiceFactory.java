package com.shikha.factory;

import com.shikha.service.StudentService;
import com.shikha.service.StudentServiceImpl;

public class StudentServiceFactory {
  private static StudentService studentService;
  
  static {
    studentService = new StudentServiceImpl();
  }
  
  public static StudentService getStudentService() {
    return studentService;
  }
}
