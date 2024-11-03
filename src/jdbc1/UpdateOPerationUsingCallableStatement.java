package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateOPerationUsingCallableStatement {
	public static void main(String[] ars) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
		CallableStatement cs=con.prepareCall("update student1 set email=?,address=? where phone=? ");
		System.out.println("enter your new email");
		cs.setString(1, sc.next());
		System.out.println("enter your new Address");
		cs.setString(2, sc.next());
		System.out.println("enter your phone number");
		cs.setLong(3,sc.nextLong());
		
		cs.execute();
		cs.close();
		con.close();
		System.out.println("it has done it");
		
	}

}
