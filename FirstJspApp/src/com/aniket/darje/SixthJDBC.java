package com.aniket.darje;
import java.sql.*;

public class SixthJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
//		Load and Register Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		
//		Create connection
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "root@123";
		 connection = DriverManager.getConnection(url, user, password);
		
		
//		Create / Prepared Statement
		 statement =connection.createStatement();
		
		
//		Execute Query
//		String query = "SELECT * FROM employee";
		 String query = "UPDATE EMPLOYEE SET name = 'Zampak' WHERE id =3";
		boolean status = statement.execute(query);
		
		if(status) {
			 rs = statement.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
		else {
			int rowsAffected = statement.getUpdateCount();
			if(rowsAffected ==0) {
				System.out.println("Failed to update");
			}
			else {
				System.out.println("Updated Successfully!");
			}
		}
		
		}
		catch(ClassNotFoundException e) {
			System.out.print(e);
			
		}
		catch( SQLException e) {
			System.out.print(e);
		}
		finally {
			try {
		        if (rs != null)
		            rs.close();

		        if (statement != null)
		            statement.close();

		        if (connection != null)
		            connection.close();

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
			System.out.print("Finally executed");
		}

	}

}
