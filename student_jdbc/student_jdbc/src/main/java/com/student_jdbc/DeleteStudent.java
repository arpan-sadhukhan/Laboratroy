package com.student_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

class DeleteStudent {


	public static void deleteStudent() {
	
		try(Connection conn=DataBaseConnectionCreation.getDBConnection();
				Scanner sc=new Scanner(System.in))
		{
			String sql="delete from student_info where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			if(row==1)
			{
				System.out.println(row+" deleted successfully");
			}
			else
				System.out.println("Id not found");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

}}


