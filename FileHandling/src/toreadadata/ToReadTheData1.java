package toreadadata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ToReadTheData1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="D://FileHandling/v.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			int a=fis.read();
			while(a!=-1) {
				System.out.print((char)a);	
				a=fis.read();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
