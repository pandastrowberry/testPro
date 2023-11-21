package ch15_IOstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamEx_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ObjectOutputStream 예제
		 * 객체를 외부로 전송하는 스트림
		 * 전송되는 객체는 반드시 Serializable 인터페이스 구현해야
		 * java.io.NotSerializableException : 
		 * 객체를 외부로 전송하는 기능을
		 * ObjectInputStream을 이용해야 객체 받을 수 있음
		 * 
		 * */
		FileOutputStream fos = new FileOutputStream("src/ch15_IOstream/object.set");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동", 20);
		Customer c2 = new Customer("김삿갓", 30);
		oos.writeObject(c1);
		oos.writeObject(c2);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("고객 1 : " + c1);
		System.out.println("고객 2 : " + c2);
		
	}

}
class Customer implements Serializable{
	private String name;
	private int age;
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
}