

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		int id = Integer.parseInt( request.getParameter("id"));
		int age = Integer.parseInt( request.getParameter("age"));
		int marks = Integer.parseInt( request.getParameter("marks"));
		Connection connection=null;
		PrintWriter writer = null;
		PreparedStatement pstmnt = null;
		
				try {
					
//					?load driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
//					Create Connection
					String url = "jdbc:mysql://localhost:3306/mydb1";
				String	user = "root";
				String password = "root@123";
				
				connection = DriverManager.getConnection(url, user, password);
				
				
//				Prepared Statement
				String query = "INSERT INTO studentinfo(id , name , age , marks) VALUES(?, ?, ?, ?)";
				
				 pstmnt = connection.prepareStatement(query);
				
				pstmnt.setInt(1, id);
				pstmnt.setString(2,name);
				pstmnt.setInt(3, age);
				pstmnt.setInt(4, marks);
				
				int rowsAffected = pstmnt.executeUpdate();
				
				 writer = response.getWriter();
				
				if(rowsAffected ==0) {
					writer.println("Failed to insert data!");
				}
				else {
					writer.println("Data inserted successfully!");
				}
					
				}catch(
						ClassNotFoundException e) {
					e.printStackTrace()
;					
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
					if(writer != null) {
						writer.close();
					}
					if(pstmnt != null) {
						pstmnt.close();
					}
					
					if(connection != null) {
						connection.close();
					}
					}
					catch(SQLException e){
						e.printStackTrace();
						
					}
				}
	}

}
