package com.aniket.darje;

import java.sql.*;
import java.util.Scanner;

public class Eighth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Connection connection = null;
	        PreparedStatement checkStmt = null;
	        PreparedStatement pstmnt = null;
	        ResultSet rs = null;
	        Scanner sc = new Scanner(System.in);
		try {
//		Load and Register Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		Create Connection
		String url="jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "root@123";
		 connection = DriverManager.getConnection(url, user, password);
		
		
//		 Check if the id is already there in db before performing insertion query
		 System.out.println("Welcome to jdbc, please enter the details below: ");
		 String checkQuery ="SELECT id FROM employee WHERE id = ?";
		 checkStmt= connection.prepareStatement(checkQuery);
		 
		 int id;
		 
		 while(true) {
			 System.out.print("Enter your unique id: ");
				 id = sc.nextInt();
				 checkStmt.setInt(1, id);
				 rs = checkStmt.executeQuery();
				 if(rs.next()) {
					 System.out.print("Please enter your unique id, the one you enter is already taken! ");
				 }else {
	                    break;
	                }

	                rs.close();
		 }
		 
		 
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.println();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.println();
		
		
//		Prepared Statement
		String query="INSERT INTO employee(id, name, age) VALUES(?,?,?)";
		 pstmnt = connection.prepareStatement(query);
	
		pstmnt.setInt(1, id);
		pstmnt.setString(2, name);
		pstmnt.setInt(3, age);
		int rowsAffected = pstmnt.executeUpdate();
		if(rowsAffected==0) {
			System.out.print("Failed to insert data!");
		}else {
			System.out.print("Data inserted successfully!");
		}
		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null)
                    rs.close();

                if (checkStmt != null)
                    checkStmt.close();
			
			if(pstmnt != null) {
				pstmnt.close();
			}
			if(connection != null) {
				connection.close();
			}    sc.close();}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
