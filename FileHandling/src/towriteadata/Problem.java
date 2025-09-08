package towriteadata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// Wp to read a string form user and write the data in side the file

		String path="D:\\FileHandling\\a.text";
		
		try {
			FileOutputStream fos= new FileOutputStream(path);
			Scanner s=new Scanner(System.in);
			System.out.println(" enter the name:");
			String ch=s.nextLine();
			char[] arr=ch.toCharArray();
			for(int i=0;i<arr.length;i++) {
				fos.write(arr[i]);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
