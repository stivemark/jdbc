package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatements_InsertDynamically {

	public static void main(String[] args) throws ClassNotFoundException {
		//load and register
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			//establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
			//create statements
			PreparedStatement ps=con.prepareStatement("insert into student1 values(1,'raman',858787,'ramanms8688@gmail.com','hyderabad')");
			//PreparedStatement ps1=con.prepareStatement("insert into student1 values(2,'ravi',87977,'ramanms@gmail.com','hyderabad')");
			//execute statements
			ps.execute();
			//close statements
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
