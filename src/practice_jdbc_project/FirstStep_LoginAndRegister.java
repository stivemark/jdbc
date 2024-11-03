package practice_jdbc_project;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class FirstStep_LoginAndRegister {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new Driver());
		System.out.println("load and register sucessfully");
		

	}

}
