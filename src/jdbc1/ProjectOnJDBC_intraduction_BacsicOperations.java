package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class ProjectOnJDBC_intraduction_BacsicOperations {
	public static void loadandRegistor(int id,String name,double salary,String companyname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=raman");
			PreparedStatement ps=con.prepareStatement("insert into new_table values(?,?,?,?)");
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setDouble(3, salary);
			ps.setString(4,companyname);
		    ps.execute();
		    ps.close();
		    con.close();
		    System.out.println("it has done");
		
			
		} catch ( SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	public static void update() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String password="raman";
		Connection con=DriverManager.getConnection(url, userName,password);
		boolean value=true;
		while(value)
		{
			System.out.println("enter your options");
			System.out.println("1.for id updation  \n2.for name  \n3.for salary   \n4.for companyname  \n5.for exit");
			int c=sc.nextInt();
			switch(c)
			{
			case 1:{
				PreparedStatement sp=con.prepareStatement("update new_table set id=? where id=? ");
				System.out.println("enter your new id");
				sp.setInt(1, sc.nextInt());
				System.out.println("enter your olde id");
				sp.setInt(2, sc.nextInt());
				System.out.println("updated");
				sp.execute();
				break;
			}
			case 2:
			{
				PreparedStatement sp1=con.prepareStatement("update new_table set name=? where id=? ");
				System.out.println("enter your new Name ");
			
				sp1.setInt(1, sc.nextInt());
				System.out.println("enter your id");
				sp1.setString(2,sc.next());
				System.out.println("updated");
				sp1.execute();
				break;
			}
			case 3:
			{
				PreparedStatement sp2=con.prepareStatement("update new_table set salary=? where id=? ");
				System.out.println("enter your new salary");
				sp2.setDouble(1, sc.nextDouble());
				System.out.println("enter your id");
				sp2.setInt(2,sc.nextInt());
				System.out.println("updated");
				sp2.execute();
				break;
			}
			case 4:
			{
				PreparedStatement sp3=con.prepareStatement("update new_table set CompanyName=? where id=? ");
				System.out.println("enter your new comapnyName");
				sp3.setInt(1, sc.nextInt());
				System.out.println("enter your new id");
				sp3.setString(2,sc.next());
				System.out.println("updated");
				sp3.execute();
				break;
			
		    }
			case 5:
			{
				value=false;
				System.out.println("thank you for leaving");
				//value=false;
			}
			default:
			{
				System.out.println("Enter valid options");
			}
			}
		}
		

		
	}
	
	
	
	
	public static void delete() {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=raman");
			PreparedStatement ps=con.prepareStatement("delete from new_table where id=?");
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
	
	
	
	
	
	
	public static void fitchAll(int id)
	{
		try {
			DriverManager.registerDriver(new Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=raman");
			PreparedStatement ps=con.prepareStatement("select * from new_table where id=?");
			ps.setInt(1, id);
			//PreparedStatement ps=con.prepareStatement("select name,email from student1 where id=1");
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				System.out.println(res.getInt("id")+" "+res.getString(2)+""+res.getDouble(3)+" "+res.getString(4));
			}
//			while(res.next())
//			{
//				System.out.println(res.getString("name")+" "+res.getString("email"));
//			}
			
			
			
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
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		boolean value=true;
		System.out.println("----------WellCome to the JDBC Intraduction----------");
		while(value)
		{
			System.out.println("Enter yoru optins");
			System.out.println(" 1.for login \n 2.for registor \n 3.for update \n 4.for delete \n 5.for fitchAll \n 6.for fitch  \n7.exist");
			Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();
			switch(s)
			{
			case 1:
				{
					//System.out.println()
					login();
				
				}
			break;
			case 2:
				{
					
					System.out.println("enter your id");
					int id=sc.nextInt();
					System.out.println("enter your name");
					String name=sc.next();
					System.out.println("enter your salary");
					double salary=sc.nextDouble();
					System.out.println("enter your comapnyname ");
					String comapnyName=sc.next();
					
					loadandRegistor(id,name,salary,comapnyName);
				
				}
			break;
			case 3:update();
			break;
			case 4:delete();
			
			case 5:
				{
					System.out.println("enter your id");
					int id=sc.nextInt();
					
					fitchAll(id);
				
				}
			break;
			case 6:
			{
				System.out.println("enter your id");
				int id=sc.nextInt();
//				System.out.println("enter your name");
//				String name=sc.next();
//				System.out.println("enter your salary");
//				double salary=sc.nextDouble();
//				System.out.println("enter your comapnyname ");
//				String comapnyName=sc.next();
				fitch(id); 
				
			}
			case 7: 
			{
					value=false;
					System.out.println(".............Thank you!.................");
			}
			break;
			default:
				System.out.println("enter valid options");
				
			}
		}
		

	}







	private static void fitch(int id) throws SQLException {
		
		
//		PreparedStatement ps=login().prepareStatement("select name from new_table where id=?");
//		ps.setInt(1, id);
		boolean value=true;
		while(value)
		{
			System.out.println("Select your optins for fitch details");
			System.out.println("1.for name  \n2.for salry  \n3.for comapnyName  \n4.exit");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
			{
				//System.out.println("Enter your id");
				PreparedStatement ps=login().prepareStatement("select name from new_table where id=?");
				ps.setInt(1, id);
				ResultSet res=ps.executeQuery();
				while(res.next())
				{
						System.out.println(res.getString("name"));
						
				}
				break;
				
			}
			case 2:
			{
				//System.out.println("enter your id");
				PreparedStatement ps=login().prepareStatement("select salary from new_table where id=?");
				ps.setInt(1, id);
				ResultSet res=ps.executeQuery();
				while(res.next())
				{
					System.out.println(res.getDouble("salary"));
				}
				break;
				
				
			}
			case 3:
			{
				//System.out.println("enter your id");
				PreparedStatement ps=login().prepareStatement("select companyName from new_table where id=?");
				ps.setInt(1, id);
				ResultSet res=ps.executeQuery();
				while(res.next())
				{
					System.out.println(res.getString(1));
				}
			}
			case 4:
			{
				value=false;
				System.out.println("Thank you");
				break;
			}
			
			default:
				System.out.println("enter valid optin");
			}
			
		}
		
		// TODO Auto-generated method stub
		
	}







	private static Connection login() throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=raman");
		return con;
		
	}

}
