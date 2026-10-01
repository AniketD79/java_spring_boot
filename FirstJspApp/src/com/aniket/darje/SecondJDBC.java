package com.aniket.darje;
import java.sql.*;
public class SecondJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

//		Load and Resgister the Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		Create Connection
		String url ="jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "root@123";
		Connection connection = DriverManager.getConnection(url, user, password);
		
//		Create / Prepared Statement
		
		Statement statement = connection.createStatement();
		
//		Execute Query
		String query = "UPDATE employee SET name='XYZ' where id =3";
		int rowsAffected = statement.executeUpdate(query);
		if(rowsAffected == 0) {
			System.out.println("Error updating the record");
		}
		else {
			System.out.println("Record updated successfully!");
		}
		
//		Closing Resources
		
		statement.close();
		connection.close();
		
	}

}
