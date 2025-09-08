package towriteadata;


import java.io.FileOutputStream;

public class ToWriteData1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String path="D://FileHandling/v.txt";
           
            try (FileOutputStream fos = new FileOutputStream(path)) {
				String s="java is programming language";
				char[]arr=s.toCharArray();
				for(int i=0;i<arr.length;i++) {
					fos.write(arr[i]);
				}
				System.out.println("loded");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
