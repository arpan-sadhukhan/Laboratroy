package com.student_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class UpdateStudent {

	public static void updateStudent() {
		
		try(Connection conn=DataBaseConnectionCreation.getDBConnection();
				Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("New Name: ");
			String name=sc.nextLine();
			System.out.println("New email: ");
			String email=sc.nextLine();
			System.out.println("New standard: ");
			int standard=sc.nextInt();
						
			String sql="update student_info set name='"+name+"',email='"+email+"',standard='"+standard+"' where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			System.out.println(row+" updated successfully");
			
			//fetching record after update
			String query="select * from student_info where id='"+id+"'";
			PreparedStatement ps1=conn.prepareStatement(query);
			
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Student Id: "+rs.getInt("id"));
				System.out.println("Student Name: "+rs.getString("name"));
				System.out.println("Student email: "+rs.getString("email"));
				System.out.println("Student standard: "+rs.getInt("standard"));
			}
			else
				System.out.println("id not found");
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
