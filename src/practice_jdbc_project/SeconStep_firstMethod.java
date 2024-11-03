package practice_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class SeconStep_firstMethod {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_servlet?user=root&password=raman");
		System.out.println("Establish the connection sucessfully");
		
		// TODO Auto-generated method stub

	}

}
