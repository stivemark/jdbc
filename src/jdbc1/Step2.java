package jdbc1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Step2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new Driver());
		String url="jdbc:mysql://localhost:3306/schema1";
		FileInputStream fileInputStream=new FileInputStream("db.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		Connection con=DriverManager.getConnection(url,properties);
		Statement s=con.createStatement();
		
	
		System.out.println("connected");
		

	}
	

}
