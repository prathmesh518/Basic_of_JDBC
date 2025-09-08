package basicsofjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ToSaveTheData3 {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/postgres?user=postgres&password=Prt#9116";
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection(url);
			String sql="insert into student values(106,'prajwal',100)";
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(sql);
			System.out.println(res);
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
