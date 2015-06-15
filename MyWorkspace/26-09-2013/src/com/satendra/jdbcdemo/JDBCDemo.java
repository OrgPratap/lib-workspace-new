package com.satendra.jdbcdemo;

import org.gtpl.student.Student;

public class JDBCDemo 
{
	public static void main(String[] args)
	{
		Student student=new Student(100, "Satendra", 66.42);
		StudentDAO dao=new StudentDAO();
		dao.addStudent(student);
		dao.closeConnection();
	}

}
