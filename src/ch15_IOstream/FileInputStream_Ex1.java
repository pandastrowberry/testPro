package ch15_IOstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_Ex1 {
	public static void main(String[] args) throws IOException {
		/*
		 * FileInputStream : 파일로부터 데이터 읽기
		 * int read() : 1byte를 읽어서 리턴
		 * int read(byte[] bnf) : bnf의크기만큼 읽어서 데이터 bnf에 저장, 실제 읽은 바이트수 리턴
		 * int read(byte[] bnf, int start, int len) : 데이터를 len바이트 만큼 읽어서 bnf에 start 인덱스부터 저장하고 실제 읽은 바이트수 리턴
		 * */
		FileInputStream fis = new FileInputStream("src/ch15_IOstream/FileInputStream_Ex1.java");
		System.out.println("*********** read() 메소드 이용");
		int data = 0;
		while((data = fis.read()) != -1) {
			System.out.print((char) data);
		}
		
		fis = new FileInputStream("src/ch15_IOstream/FileInputStream_Ex1.java");
		System.out.println("*********** read() 메소드 이용");
		byte[] bnf = new byte[10];
		while((data = fis.read(bnf)) != -1) {
			System.out.print(new String(bnf, 0, data) );
		}
		
		fis = new FileInputStream("src/ch15_IOstream/FileInputStream_Ex1.java");
		System.out.println("*********** read(byte[] bnf) 메소드 이용");
		File f1 = new File("src/ch15_IOstream/FileInputStream_Ex1.java");
		System.out.println("length : " + f1.length());
		System.out.println(fis.available() + "===============");
		bnf = new byte(fis.available());
		while ((data = fis.read(bnf, 0, bnf.length) != -1)) {
			System.out.println(new String(bnf, 0, data));
			System.out.println("end===========");
		}
		
	}
}
