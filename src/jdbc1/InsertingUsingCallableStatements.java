package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingUsingCallableStatements {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		//DriverManager.registerDriver(new Driver);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
		CallableStatement cs=con.prepareCall("call student.insert(?,?,?,?,?)");
		System.out.println("enter your id");
		cs.setInt(1,sc.nextInt());
		System.out.println("enter your name");
		cs.setString(2, sc.next());
		System.out.println("enter your phone");
		cs.setDouble(3, sc.nextDouble());
		System.out.println("enter your email");
		cs.setString(4, sc.next());
		System.out.println("enter your address");
		cs.setString(5,sc.next());
		cs.execute();
		cs.close();
		con.close();
		System.out.println("it is worikd");
		
		
		
	}

}
