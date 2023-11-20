package ch15_IOstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class File_Ex4 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * 
		 * */
		FileOutputStream fos = new FileOutputStream("src/ch15_IOstream/out.txt");
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		
		byte[] bnf = "\n반갑습니다.FileOutputStream 예제 입니다.\n".getBytes();
		System.out.println(bnf.length);
		
		fos.write(bnf);
		fos.write(bnf, 1, 6);
		fos.flush();
	}

}
