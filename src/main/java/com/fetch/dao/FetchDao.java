package com.fetch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.employee.Employee;
import com.student.Student;

public class FetchDao {
	String sql = "select * from  Yatharth_111915140_detail where empid=?";
	String url = "jdbc:mysql://localhost:3306/navin";
	String username = "root";
	String password = "dada23112001";
	public ArrayList<Employee> check(String empid)
	{
		String emp_id = null;
	    String fname = null;
	    String lname = null;
	    String dob = null;
	    String cno = null;
	    String job = null;
	    String msal = null;
	    String ybonus = null;

		ArrayList<Employee> Employees = new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, empid);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				emp_id = rs.getString(1); 
		        fname = rs.getString(3); 
		        lname = rs.getString(4);
		        dob = rs.getString(5);
		        cno = rs.getString(6);
		        
		        
				//Employees.add(new Employee(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			}
			
			String sql1 = "select * from  Yatharth_111915140_Salary_detail where empid=?";
			st = con.prepareStatement(sql1);
			st.setString(1, empid);
			ResultSet rs2 = st.executeQuery();
			while(rs2.next())
			{
				job = rs2.getString(2);
				msal = rs2.getString(3);
				ybonus = rs2.getString(4);
			}
			
			Employees.add(new Employee(emp_id, fname, lname, dob, cno, job, msal, ybonus));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return Employees;
	}
}
