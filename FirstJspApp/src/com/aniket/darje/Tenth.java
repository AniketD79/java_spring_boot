package com.aniket.darje;

import java.sql.*;
import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		PreparedStatement pstmnt = null;
		PreparedStatement pstmntid= null;
		ResultSet rs=null;
		Scanner sc = new Scanner(System.in);
		
		try {
//		Load and Register Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		Create Connection
		String url= "jdbc:mysql://localhost:3306/mydb1";
		String user ="root";
		String password="root@123";
		 connection = DriverManager.getConnection(url, user, password);
		
		
//		Check if id exists  though this step is unnecessary and adds an extra query check-up
		String checkId= "SELECT id from employee WHERE id = ?";
		pstmntid= connection.prepareStatement(checkId);
		int id;
		
		while(true) {
//			DIsplay to enter id
			System.out.print("Please enter your unique id: ");
			
//			Get the id from user input
			id = sc.nextInt();
			
//			Set the id
			pstmntid.setInt(1, id);
			
//			Execute the query 
			rs = pstmntid.executeQuery();
			
//			Check if rs got id that is id exists
			if(rs.next()) {
				break;
			}else {
				System.out.println("Please enter a valid id");
			}
			rs.close();
		}
		
//		After id is found now lets update the data
		String updateQuery= "UPDATE employee SET name = ? WHERE id = ?";
		pstmnt = connection.prepareStatement(updateQuery);
		
//		Now let's take user input for name
		System.out.print("Please enter the updated name: ");
		String name = sc.next();
		pstmnt.setString(1, name);
		pstmnt.setInt(2, id);
		
//		Now let's execute 
		int rowsAffected = pstmnt.executeUpdate();
		
		
//		Now let's process the result
		if(rowsAffected ==0) {
			System.out.println("Failed to update!");
		}
		else {
			System.out.println("Name updated successfully!");
			
		}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			try
			{
				if(rs != null) {
					rs.close();
				}
				if(pstmntid != null) {
					pstmntid.close();
				}
				if(pstmnt != null) {
					pstmnt.close();
				}
				if(connection != null) {
					connection.close();
				}
				sc.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
