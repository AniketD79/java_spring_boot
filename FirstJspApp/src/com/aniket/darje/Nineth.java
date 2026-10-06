package com.aniket.darje;

import java.sql.*;
import java.util.Scanner;

public class Nineth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		PreparedStatement pstmnt= null;
		PreparedStatement pstmntid=null;
		ResultSet rs=null;
		Scanner sc = new Scanner(System.in);
	
		
		try {
//		Load and Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Create Connection
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password ="root@123";
		connection = DriverManager.getConnection(url, user, password);
		
		
//		To check if id already exists
		
		System.out.println("Welcome to jdbc, please enter your details below!");
		String idChk="SELECT id FROm employee WHERE id = ?";
		pstmntid = connection.prepareStatement(idChk);
		int id;
		
		while(true) {

			System.out.print("Please enter your unique id: ");
			id = sc.nextInt();
			 pstmntid.setInt(1, id);
			 rs = pstmntid.executeQuery();
			if(rs.next()) {
				System.out.println("Id already exists! Please enter your unique id!");
			}
			else {
				break;
				
			}rs.close();
			
		}
		System.out.print("Please enter your name: ");
		String name = sc.next();
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		
		String query= "INSERT INTO employee(id, name, age) VALUES(?,?,?)";
		pstmnt = connection.prepareStatement(query);
		pstmnt.setInt(1, id);
		pstmnt.setString(2, name);
		pstmnt.setInt(3, age);
		
		int rowsAffected = pstmnt.executeUpdate();
		if(rowsAffected ==0) {
			System.out.println("Failed to insert data!");
		}else {
			System.out.println("Data inserted successfully!");
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
//				rs.close();
				if (rs != null)
                    rs.close();
				sc.close();
				if(pstmnt != null) {
				pstmnt.close();}
				if(pstmntid != null) {
				pstmntid.close();}
				if(connection != null) {
				connection.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
