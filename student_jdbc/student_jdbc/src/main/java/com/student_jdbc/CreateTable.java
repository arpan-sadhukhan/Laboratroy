package com.student_jdbc;

import java.sql.Connection;
import java.sql.Statement;

class CreateTable {
	
	public static void createTable()
	{
		try(Connection conn= DataBaseConnectionCreation.getDBConnection())
		{
			Statement st=conn.createStatement();
			String sql="create table student_info(id int primary key, name varchar(30), email varchar(50),standard int)";
			st.executeUpdate(sql);
			System.out.println("table successfully created");
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
