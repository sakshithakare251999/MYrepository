package com.thekiranacademy;

import java.sql.*;

public class TestJdbc {

	public static void main(String[] args) throws Exception 
	{


		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fournineeight","root","root");
		
		  System.out.println("Connected to database");
		  
		Statement st=con.createStatement();
		
		st.executeUpdate("insert into employee values(5,'raman',80000)");
		
		  System.out.println("Record inserted");
		
	    
		
		

	}

}
