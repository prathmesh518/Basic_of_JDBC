 package towriteadata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteAData {

	public static void main(String[] args) throws IOException {
		// Step 1 ---path
//		when we get file not found exception ----> in path we have not give file name
		String path="D:\\FileHandling\\a.txt";
		try {
		FileOutputStream fos=new FileOutputStream(path);
		char ch='A';
		fos.write(ch);
		System.out.println();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
