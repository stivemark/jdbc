package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRowBasedOnPreparedStatements {
	

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
			PreparedStatement  ps= con.prepareStatement("update student1 set name=? where id=? ");
			System.out.println("enter the name");
			ps.setString(1,sc.next());
			System.out.println("enter the id");
			ps.setInt(2, sc.nextInt());
			ps.execute();
			ps.close();
			con.close();
			System.out.println("it is done it");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		

	}

}
