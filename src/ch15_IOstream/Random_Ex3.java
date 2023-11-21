package ch15_IOstream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumkor = 0; 
		int sumeng = 0;
		int summath = 0;
		
		try {
			RandomAccessFile raf = new RandomAccessFile("src/ch15_IOstream/score.dat", "r");
		int i = 4;
			raf.seek(i);
			
			
			while (true) {
				sumkor += raf.readInt();
				sumeng += raf.readInt();
				summath += raf.readInt();
				i += 16;
			} 
				
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("sumkor : " + sumkor);
			System.out.println("sumeng : " + sumeng);
			System.out.println("summath : " + summath);
			//e.printStackTrace();
		}
	}
}
