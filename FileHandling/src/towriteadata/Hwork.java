package towriteadata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hwork {

	public static void main(String[] args) {
		String path ="D:\\FileHandling\\a.txt";
		
		try {
			FileOutputStream fis=new FileOutputStream(path);
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name you have to write ");
			char a=s.next().charAt(0);
			fis.write(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
