package toreadadata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadAData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\FileHandling\\a.txt";
		 
		try {
			FileInputStream fos=new FileInputStream(path);
//			System.out.println((char)(fos.read())); this for one letter read
			int a=fos.read();          //this for read words or lines
			while(a!=-1) {
				System.out.println((char)a);
				a=fos.read();
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
