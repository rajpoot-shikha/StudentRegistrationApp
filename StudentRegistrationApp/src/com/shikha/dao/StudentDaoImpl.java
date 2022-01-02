package com.shikha.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.shikha.model.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStudents(ArrayList<Student> studentList) {
		java.sql.Connection conn = null;
		PreparedStatement pst = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dummydb", "root", "Password@01");
			pst = conn.prepareStatement("insert into student values(?, ?, ?)");

			for (Student student : studentList) {
				pst.setString(1, student.getName());
				pst.setInt(2, student.getRollNo());
				pst.setString(3, student.getCourse());
				pst.execute();
			}
			System.out.println("Students Added!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Student> getStudents() {
		java.sql.Connection conn = null;
		ArrayList<Student> studentList = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dummydb", "root", "Password@01");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from student");
			while (rs.next()) {
				studentList.add(new Student(rs.getString("sname"), rs.getInt("sroll"), rs.getString("scourse")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}
}