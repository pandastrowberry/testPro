package ch15_IOstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_Ex1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ch15_IOstream/object.set"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		
		ois.close();
		
		System.out.println("고객 1 : " + c1);
		System.out.println("고객 2 : " + c2);
	}

}
