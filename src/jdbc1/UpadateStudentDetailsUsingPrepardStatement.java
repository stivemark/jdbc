package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpadateStudentDetailsUsingPrepardStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
			PreparedStatement s=con.prepareStatement("update student1 set phone=?,email=?,address=? where id=?");
			System.out.println("enter your phne number:");
			s.setLong(1, sc.nextLong());
			System.out.println("enter your email:");
			s.setString(2,sc.next());
			System.out.println("enter your Address:");
			s.setString(3, sc.next());
			System.out.println("Enter your id");
			s.setInt(4, sc.nextInt());
			
			s.execute();
			s.close();
			con.close();
			System.out.println("it has done it");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
