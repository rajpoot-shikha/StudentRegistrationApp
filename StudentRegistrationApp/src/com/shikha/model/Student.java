package com.shikha.model;

public class Student {
  private String name;
  private int rollNo;
  private String course;
  
  public Student(String name, int roll_no, String course) {
    this.name = name;
    this.rollNo = roll_no;
    this.course = course;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getRollNo() {
    return rollNo;
  }
  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }
  public String getCourse() {
    return course;
  }
  public void setCourse(String course) {
    this.course = course;
  }
}
