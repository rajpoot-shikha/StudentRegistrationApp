package com.shikha.factory;

import com.shikha.dao.StudentDao;
import com.shikha.dao.StudentDaoImpl;

public class StudentDaoFactory {
  private static StudentDao studentDao;
 
  static {
    studentDao = new StudentDaoImpl();   
  }
  
  public static StudentDao getStudentDao() {
    return studentDao;
  }
}
