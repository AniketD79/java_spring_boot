package com.aniket.darje;
import java.sql.*;

public class ThirdJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
//		Load and Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		Create Connection
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "root@123";
		Connection connection = DriverManager.getConnection(url, user, password);
		
//		Create / Prepared Statement
		Statement statement = connection.createStatement();
		
		
//		Execure Query
		String sql = "DELETE FROM employee where age < 24";
		int rowsAffected = statement.executeUpdate(sql);
		
		
//		Process Result
		if(rowsAffected ==0) {
			System.out.println("Failed to delete record");
		}else {
			System.out.println("Record deleted successfully!");
		}

		
//		Close Resources
		statement.close();
		connection.close();
	}

}
