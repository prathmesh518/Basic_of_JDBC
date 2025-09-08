package towriteadata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem2 {

	public static void main(String[] args) {
		// // wAJP to table of 3 and write inside a file
		String path="D:\\FileHandling\\TableOf3.txt";
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
			for(int i=0;i<=10;i++) {
				String a=i+"*"+"3"+"="+(i*3)+"\n";
				fos.write(a.getBytes());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
}

