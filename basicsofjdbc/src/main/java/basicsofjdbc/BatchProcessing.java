package basicsofjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchProcessing {

	public static void main(String[] args) {
	try {
		 Connection con = CreateConnection.getConnect();
		 String sql="insert into employee values(?,?,?)";
		 PreparedStatement pstm = con.prepareStatement(sql);
		 pstm.setInt(1, 5);
		 pstm.setString(2, "ram");
		 pstm.setInt(3, 100000);
		 pstm.addBatch();
		 pstm.setInt(1, 6);
		 pstm.setString(2, "sham");
		 pstm.setInt(3, 50000);
		 pstm.addBatch();
		 pstm.setInt(1, 7);
		 pstm.setString(2, "jan");
		 pstm.setInt(3, 40000);
		 pstm.addBatch();
		 pstm.executeBatch();
		 con.close();
		System.out.println("loded");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
