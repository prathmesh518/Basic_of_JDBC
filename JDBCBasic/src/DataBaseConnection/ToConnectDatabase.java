package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ToConnectDatabase {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/shop";
		String username="postgres";
		String password="Prt#9116";
//		Driver driver = new Driver();
		try {
//			load the driver class into the memory
			Class.forName("org.postgresql.Driver");
//			open the connection
			Connection connect = DriverManager.getConnection(url,username,password);
			String sql="insert into product values(105,'pen',5)";
//			 to create an statement
			Statement stm=connect.createStatement();
//			execute the query
			boolean e = stm.execute(sql);
			System.out.println(e);
//			close the connection
			connect.close();
			System.out.println("successfully load");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}

}
