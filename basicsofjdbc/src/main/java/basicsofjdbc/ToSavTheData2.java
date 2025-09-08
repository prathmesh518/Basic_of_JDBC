package basicsofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ToSavTheData2 {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/postgres?user=postgres&password=Prt#9116";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url);
			String sql="select * from student ";
			 Statement stm = con.createStatement();
			 ResultSet res = stm.executeQuery(sql);
			 while(res.next()) {
				 System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getDouble(3));
			 }
			 con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
