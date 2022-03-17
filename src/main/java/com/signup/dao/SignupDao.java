package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	
	public void pushToDB(String empid,String pass,String fname,String lname,String dob,String cno)
	{
		
		String sql = "insert into Yatharth_111915140_detail values('"+empid+"','"+pass+"','"+fname+"','"+lname+"','"+dob+"','"+cno+"')";
		String url = "jdbc:mysql://localhost:3306/navin";
		String username = "root";
		String password = "dada23112001";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			
			int rs = st.executeUpdate();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
