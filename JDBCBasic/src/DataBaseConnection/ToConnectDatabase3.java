     package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ToConnectDatabase3 {
	public static void main (String[] args) {
		String url="jdbc:postgresql://localhost:5432/shop";
		String username="postgres";
		String password="Prt#9116";
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connect=DriverManager.getConnection(url,username,password);
			String sql="select * from  product where pname like '%e'";
			Statement stm=connect.createStatement();
			ResultSet res = stm.executeQuery(sql);
			while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getDouble(3));
			}
			connect.close();
			System.out.println("loded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
