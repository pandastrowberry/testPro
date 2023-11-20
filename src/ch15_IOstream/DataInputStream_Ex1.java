package ch15_IOstream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("src/ch15_IOStream/sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			File f = new File("src/ch15_IOstream/sample.dat");
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			
			dis.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
