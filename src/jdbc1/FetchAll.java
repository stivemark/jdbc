package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class FetchAll {

	public static void main(String[] args) {	
		try {
			DriverManager.registerDriver(new Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=raman");
			//PreparedStatement ps=con.prepareStatement("select * from student1");
			PreparedStatement ps=con.prepareStatement("select name,email from student1 where id=1 ");
			ResultSet res=ps.executeQuery();
//			while(res.next())
//			{
//				System.out.println(res.getInt("id")+" "+res.getString(2)+""+res.getLong(3));
//			}
			while(res.next())
			{
				System.out.println(res.getString("name")+" "+res.getString("email"));
			}
			
			
			
//			while(res.next())
//			{
//				System.out.println(res.getString("address"));
//			}
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
