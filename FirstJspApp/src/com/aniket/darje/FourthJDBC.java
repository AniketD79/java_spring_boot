package com.aniket.darje;
import java.sql.*;
public class FourthJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
//		Load and Register Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		Create Connection
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password= "root@123";
		Connection connection = DriverManager.getConnection(url, user, password);
		
//		Create Statement
		Statement statement = connection.createStatement();
		
		
//		Execute Query
		String query = "SELECT * FROM employee";
		ResultSet rs = statement.executeQuery(query);
		
		
//		Process Result
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		
//		Close Resources
		rs.close();
		statement.close();
		connection.close();
		

	}

}
