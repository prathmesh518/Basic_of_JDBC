package towriteadata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// WAJP  to check the  given String is palindrom or not if its palindrom write the input string concating with palindrom
// wAJP to table of 3 and write inside a file
			String path="D:\\FileHandling\\c.text";
			
			try {
				FileOutputStream fos= new FileOutputStream(path);
				Scanner s=new Scanner(System.in);
				System.out.println(" enter the name:");
				String ch=s.nextLine();
				String[] arr=ch.split("");
				String rev ="";
				for(int i=0;i<arr.length;i++) {
					rev=rev+arr[i];
				}
				if(ch.equals(rev)) {
					for(int i=0;i<ch.length();i++) {
						fos.write(ch.charAt(i));
					}
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


