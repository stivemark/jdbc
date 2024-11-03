package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePhoneandEmailUsingId {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String userName="root";
		String password="raman";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement s=con.createStatement();
		s.execute("update student1 set phone='8179997243',email='ramanjaneyule@gmail.com' where id=1 ");
		s.close();
		con.close();
		
		
		System.out.println("done it");
		

	}

}
