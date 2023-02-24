package com.student_jdbc;

import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		CreateTable.createTable();
		//printing all available operation for user
		System.out.println("========Welcome To Student Management System========");
		System.out.println("Choose your operation: ");
		System.out.println("1. Insert a new student");
		System.out.println("2. Update a student");
		System.out.println("3. Show all student");
		System.out.println("4. Show a student by Id");
		System.out.println("5. Delete a student");
		int choice=sc.nextInt();
		//switch-case to choose operation
		switch(choice)
		{
		case 1:InsertStudent.insertStudent();
		break;
		case 2:UpdateStudent.updateStudent();
		break;
		case 3:SelectStudent.selectAllStudent();
		break;
		case 4:SelectStudent.selectStudentById();
		break;
		case 5:DeleteStudent.deleteStudent();
		default:
			System.out.println("Invalid input");
		}
		
		


	}

}
