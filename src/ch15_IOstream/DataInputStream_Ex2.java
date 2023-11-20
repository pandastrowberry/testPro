package ch15_IOstream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		int sum = 0;
		
		try {
			fis = new FileInputStream("src/ch15_IOstream/score.dat");
			dis = new DataInputStream(fis);
			
			while (true) {
				int score;
				score = dis.readInt();
				sum += score;
				System.out.println(score);
			}
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("합계 : " + sum);
		} finally {
			try {
				dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
