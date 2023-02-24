package com.student_jdbc;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection conn=DataBaseConnectionCreation.getDBConnection();
        System.out.println(conn);
    }
}
