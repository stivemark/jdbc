package jdbc1;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step1 {

	public static void main(String[] args, Driver driver) throws ClassNotFoundException, SQLException {
//		step1 loading and 
		Class.forName("com.mysql.cj.jdbc.Driver");//with out 
		//step 2
		Driver d=new com.mysql.cj.jdbc.Driver();//Driver is Interface 
		DriverManager.registerDriver(d);
		
		System.out.println("it is done");
		// TODO Auto-generated method stub  

	}

}
