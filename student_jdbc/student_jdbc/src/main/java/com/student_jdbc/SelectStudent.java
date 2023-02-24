package com.student_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class SelectStudent {

	public static void selectAllStudent() {
		
		try(Connection conn=DataBaseConnectionCreation.getDBConnection())
		{
			String sql="select * from student_info";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Student Id: "+rs.getInt(1));
				System.out.println("Student name: "+rs.getString(2));
				System.out.println("Student email: "+rs.getString(3));
				System.out.println("Student standard: "+rs.getInt(4));
				System.out.println("=====================================");
			}
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
public static void selectStudentById() {
		
		try(Connection conn=DataBaseConnectionCreation.getDBConnection();
				Scanner sc=new Scanner(System.in))
		{
			String sql="select * from student_info where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Student name: "+rs.getString("name"));
				System.out.println("Student email: "+rs.getString("email"));
				System.out.println("Student standard: "+rs.getInt("standard"));
				
			}
			
		}catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
