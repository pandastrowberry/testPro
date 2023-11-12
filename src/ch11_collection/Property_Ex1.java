package ch11_collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Properties 클래스 : Hashtable 테이블의 하위 클래스
		 * 					 Hashtable은 Map 인터페이스의 구현 클래스인데 Properties 클래스도 Map 구현 
		 * (key, value) 자료형이 모두 String이고, 제네릭 표현 안함
		 * 텍스트 파일에 Properties 객체를 추가할 수 있는 기능이 있음
		 * */
		
		Properties pr = new Properties();
		System.out.println(pr);
		FileInputStream fis = new FileInputStream("src/ch11_collection/a.properties");
		pr.load(fis);
		System.out.println(fis);
		
		System.out.println("이름 : " + pr.get("name"));
		System.out.println("전화번호 : " + pr.getProperty("tel"));
		pr.put("subject", "컴퓨터공학");
		System.out.println(pr);
		
		FileOutputStream fos = new FileOutputStream("src/ch11_collection/a.properties");
		pr.store(fos, "#save");
	}

}
