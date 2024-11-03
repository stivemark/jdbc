package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertOPerationByusingPrepardStatement {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
			PreparedStatement ps=con.prepareStatement("insert into student1 values(?,?,?,?,?)");
			System.out.println("enter your id");
			ps.setInt(1,sc.nextInt());
			System.out.println("enter your name");
			ps.setString(2, sc.next());
			System.out.println("enter your phone");
			ps.setLong(3, sc.nextLong());
			System.out.println("enter your email");
			ps.setString(4, sc.next());
			System.out.println("enter yoru address");
			ps.setString(5, sc.next());
			ps.execute();
			//ps.close();
			//con.close();
			System.out.println("it has done");
		
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
