package basicsofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {

	public static Connection getConnect() {
		Connection con=null;
		try {
			Class.forName("org.postgresql.Driver");
			 con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop?user=postgres&password=Prt#9116");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
}


