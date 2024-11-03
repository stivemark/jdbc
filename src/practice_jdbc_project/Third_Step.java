package practice_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Third_Step {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_servlet?user=root&password=raman");
		Statement s=con.createStatement();
		s.execute("update student set phone='8688505451' where email='1@gamil.com'");
		s.execute("insert into student values('raman123@gmail.com',9989764351,'ram','Raman',45,'male','yrk')");
		s.close();
		System.out.println("updated ");
		

	}

}
