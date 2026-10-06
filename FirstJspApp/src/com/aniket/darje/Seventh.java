package com.aniket.darje;
import java.sql.*;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement pstatement =null;
		try {
//		Load and Register Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		Create Conection
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "root@123";
		 connection = DriverManager.getConnection(url, user, password);
//			Just to check if connection is success or not
			if(connection.isValid(5)) {
				 System.out.println("Connection is valid");
	        } else {
	            System.out.println("Connection is not valid");
			}
		
//		Prepared Statement
		String query = "UPDATE employee SET name = ? WHERE id = ?";
		 pstatement = connection.prepareStatement(query);
		pstatement.setString(1, "Shengdanya");
		pstatement.setInt(2, 3);
//		Process result
		int rowsAffected = pstatement.executeUpdate();
		if(rowsAffected==0) {
			System.out.println("Failed to update!");
		}else {
			System.out.println("Updated successfully!");
		}

	}
	
		catch(SQLException e) {e.printStackTrace();}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		finally {
		    try {
		        if (pstatement != null)
		            pstatement.close();

		        if (connection != null)
		            connection.close();

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

			
	}
	

	}
