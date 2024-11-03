package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementsDydanmicInsert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
			PreparedStatement ps=con.prepareStatement("INSERT INTO student1  VALUES (?,?,?,?,?)");
			
			System.out.println("enter id");
			ps.setInt(1, sc.nextInt());
			System.out.println("enter name");
			ps.setString(2, sc.next());
			System.out.println("enter phone");
			ps.setLong(3, sc.nextLong());
			System.out.println("enter email");
			ps.setString(4,sc.next());
			System.out.println("enter Address");
			ps.setString(5, sc.next());
			ps.execute();			
			ps.close();
			con.close();
			System.out.println("done it");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
