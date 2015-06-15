package com.satendra.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.gtpl.student.Student;

public class StudentDAO 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public StudentDAO()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("-------DRIVER LOADED-------");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			System.out.println("-------CONNECTED TO DATABASE-------");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addStudent(Student studentObj)
	{
		String query="insert into student_database values("+studentObj.getRollNo()+",'"+studentObj.getName()+"',"+studentObj.getPercent()+")";
		
		try {
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("--------Record Inserted properly-------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void closeConnection()
	{
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}

}
