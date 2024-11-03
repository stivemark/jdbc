package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
			PreparedStatement ps=con.prepareStatement("delete from student1 where id=?");
			System.out.println("enter your id");
			ps.setInt(1, sc.nextInt());
			ps.execute();
			ps.close();
			con.close();
			System.out.println("it has done it");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
