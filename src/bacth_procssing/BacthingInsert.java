package bacth_procssing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class BacthingInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<Toy>list=new ArrayList<Toy>();
		list.add(new Toy(1,"bike",68,5000));
		list.add(new Toy(2,"car",68,5000));
		list.add(new Toy(3,"aeroplane",68,5000));
		list.add(new Toy(4,"boat",68,5000));
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?user=root&password=raman");
		PreparedStatement ps=con.prepareStatement("insert into toy values(?,?,?,?)");
		
		for(Toy t:list)
		{
			ps.setInt(1, t.id);
			ps.setString(2,t.name );
			ps.setInt(3, t.quantity);
			ps.setDouble(4,t.price);
			ps.addBatch();
			System.out.println("added onto batch "+t.name);
		
		}
		int []a=ps.executeBatch();
		System.out.println("execution done");
		//ps.execute();
		ps.close();
		con.close();
		System.out.println(Arrays.toString(a));
		
		
		
		}

}


class Toy{
	int id;
	String  name;
	int quantity;
	double price;
	public Toy(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
