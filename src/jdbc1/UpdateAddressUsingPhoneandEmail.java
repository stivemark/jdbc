package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAddressUsingPhoneandEmail {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String userName="root";
		String password="raman";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement s=con.createStatement();
		s.execute("update student1 set address='hyderabad' where phone=8688505451 and email='ramanjaneyule@gmail.com'");
		s.close();
		con.close();
		System.out.println("it has done it");
		
		
	}

}
