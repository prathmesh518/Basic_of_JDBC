package basicsofjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
	public static void saveEmployee(Employee e) {
		Connection con = CreateConnection.getConnect();
		String sql="insert into employee values(?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, e.getId());
			pst.setString(2, e.getName());
			pst.setInt(3, e.getSal());
			int res = pst.executeUpdate();
			System.out.println(res);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	 
	public static void findAll() {
		Connection con = CreateConnection.getConnect();	
		try {
			Statement cst = con.createStatement();
			String sql="select * from employee";
			ResultSet res = cst.executeQuery(sql);
			while(res.next()) {
				 System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
