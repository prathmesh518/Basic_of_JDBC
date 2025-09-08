package towriteadata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SentWriteFile {
	

		public static void main(String[] args) {
			String path="D:\\FileHandling\\n.txt";
			try {
				FileOutputStream fos=new FileOutputStream(path);
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the sentence :");
				String s=sc.nextLine();
				char[] arr=s.toCharArray();
				for(int i=0;i<arr.length;i++) {
					fos.write(arr[i]);
				}
				System.out.println("successfully insert data into file");
				fos.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

