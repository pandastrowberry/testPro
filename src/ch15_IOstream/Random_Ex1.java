package ch15_IOstream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Random_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.writeLong(100L);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
