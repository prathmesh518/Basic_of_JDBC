package DataBaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ToConnectDatabase4 {
	public static void main (String[] args) {
		String url="jdbc:postgresql://localhost:5432/shop";
		String username="postgres";
		String password="Prt#9116";
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connect=DriverManager.getConnection(url,username,password);
			String sql="Delete from product where pid=107";
			Statement stm=connect.createStatement();
			int res = stm.executeUpdate(sql);
			System.out.println(res);
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
