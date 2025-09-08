package basicsofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ToSaveTheData4 {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/postgres?user=postgres&password=Prt#9116";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url);
			String sql="insert into student values(?,?,?)";
			PreparedStatement res = con.prepareStatement(sql);
			res.setInt(1,107);
			res.setString(2,"pdyaa");
			res.setDouble(3, 101);
			res.execute();
			System.out.println("loded");
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
