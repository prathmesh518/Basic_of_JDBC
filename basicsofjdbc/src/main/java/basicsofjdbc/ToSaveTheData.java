package basicsofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ToSaveTheData {

	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/shop?user=postgres&password=Prt#9116";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url);
			String sql="insert into product values(?,?,?)";
		    PreparedStatement ps = con.prepareStatement(sql);
		    ps.setInt(1, 107);
		    ps.setString(2, "ring");
		    ps.setDouble(3, 12);
			ps.execute();
		    con.close();
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
