package ch15_IOstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 90, 95, 85, 50};
		try {
			FileOutputStream fos = new FileOutputStream("src/ch15_IOstream/score.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			for (int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
