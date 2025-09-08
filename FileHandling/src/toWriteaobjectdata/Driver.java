package toWriteaobjectdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\FileHandling\\a.txt";
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			Employee e=new Employee(1,"prathmesh");
			oos.writeObject(e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
