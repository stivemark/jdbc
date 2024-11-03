package bacth_procssing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class BcthProcessing_Delete {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			ArrayList<String>list=new ArrayList<String>();
			//list.add("car");
			list.add("aeroplane");
			//list.add("");
			//list.add("boat");
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?user=root&password=raman");
			PreparedStatement ps=con.prepareStatement("delete from toy where name=?");
			
			for(String t:list)
			{
				ps.setString(1, t);
				ps.addBatch();
				
			
			}
			int []a=ps.executeBatch();
			System.out.println("execution done");
			ps.execute();
			ps.close();
			con.close();
			System.out.println(Arrays.toString(a));
			
			
			
			}

	}


	