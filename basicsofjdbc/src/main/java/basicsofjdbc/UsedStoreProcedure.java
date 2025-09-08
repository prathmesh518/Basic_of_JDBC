package basicsofjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UsedStoreProcedure {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/shop?user=postgres&password=Prt#9116";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url);
			String sql="call student_procedure(?,?,?,?,?)";
			CallableStatement ctm = con.prepareCall(sql);
			ctm.setInt(1, 2);
			ctm.setString(2, "shreya");
			ctm.setString(3, "A+");
			ctm.setString(4, "male");
			ctm.setInt(5, 1234);
			ctm.execute();
			con.close();
			System.out.println("loded");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
