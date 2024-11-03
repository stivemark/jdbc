package jdbc1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Step2UsinggetconnectionTwoArgumentMethod {

	public static void main(String[] args) throws SQLException, IOException {
		DriverManager.registerDriver(new Driver());
		String url="jdbc:mysql://localhost:3306/student_servlet";
		FileInputStream fis=new FileInputStream("dp.pr");
		Properties pr=new Properties();
		pr.load(fis);
		Connection con=DriverManager.getConnection(url,pr);
		System.out.println("connection done");
		
		

	}

}
