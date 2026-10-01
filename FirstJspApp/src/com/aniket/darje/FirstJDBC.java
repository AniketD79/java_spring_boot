package com.aniket.darje;
import java.sql.*;
public class FirstJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

//		Laod and Register drivers
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		

//		Create Connection
		String url= "jdbc:mysql://localhost:3306/mydb1";
		String user ="root";
		String password = "root@123";
		Connection connection = DriverManager.getConnection(url, user, password);
		
//		Just to check if connection is success or not
		if(connection.isValid(5)) {
			 System.out.println("Connection is valid");
        } else {
            System.out.println("Connection is not valid");
		}
		
//		Create Statement / PreparedStatement 
		Statement statement = connection.createStatement();
		
//		Execute Query
	String query= "INSERT INTO employee(id, name, age) VALUES(3, 'ABC', 24)";
	int rowsAffected = statement.executeUpdate(query);
//		Process ResultSet 
	if(rowsAffected ==0) {
System.out.println("Unable to insert data");
		
	}
	else {
		System.out.println("Data inserted successfully!");
	}
//		Close Resource
		statement.close();
		connection.close();
		

	}

}
