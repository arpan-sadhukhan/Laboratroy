package com.student_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

class InsertStudent {

	public static void insertStudent() {
		
		try(Connection conn=DataBaseConnectionCreation.getDBConnection();
				Scanner sc=new Scanner(System.in))
		{
			String sql="insert into student_info values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			//taking user inputs of student information
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name: ");
			String name=sc.nextLine();
			System.out.println("Enter email: ");
			String email=sc.nextLine();
			System.out.println("Enter standard: ");
			int standard=sc.nextInt();
			
			//setting variables to their respective fields
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, standard);
			
			int row=ps.executeUpdate();
			System.out.println(row+" row inserted successfully");	
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
