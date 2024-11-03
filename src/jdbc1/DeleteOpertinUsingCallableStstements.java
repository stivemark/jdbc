package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOpertinUsingCallableStstements {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
		CallableStatement cs=con.prepareCall("call student.delete(?)");
		System.out.println("enter your id");
		cs.setInt(1, sc.nextInt());
		cs.execute();
		cs.close();
		con.close();
		System.out.println("it is done  it ");
		
		
		

	}

}
