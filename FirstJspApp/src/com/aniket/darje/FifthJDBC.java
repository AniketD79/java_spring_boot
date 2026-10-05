package com.aniket.darje;
import java.sql.*;

public class FifthJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
//		Load and Register Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		Create Connection
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "root@123";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		
//		Create / Prepared Statement
		Statement statement = connection.createStatement();
		
		
//		Execute Query
		String query = "UPDATE employee Set name='Bunny' WHERE id =3";
		boolean success = statement.execute(query);
		
		System.out.println(success);
//		Process Result
		if(success) {
			System.out.println("Updated Successfully!");
		}
		else {
			System.out.println("Failed to update");
		}

		
//		Close Resources
		statement.close();
		connection.close();
	}

}
