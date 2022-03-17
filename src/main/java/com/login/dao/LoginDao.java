package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql = "select * from  Yatharth_111915140_detail where empid=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/navin";
	String username = "root";
	String password = "dada23112001";
	public boolean check(String empid, String pass)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, empid);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}
}
