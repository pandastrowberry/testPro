package ch15_IOstream;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Random_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {1, 100, 90, 90, 2, 70, 90, 100, 3, 100, 100, 100, 4, 70, 60, 80, 5, 70, 90, 100};
		RandomAccessFile raf;
		
		try {
			raf = new RandomAccessFile("score2.dat", "rw");
			for (int i = 0; i < score.length; i++) {
				raf.writeInt(score[i]);
			}
			System.out.println("===========");
			
			raf.seek(0);
			while(true) {
				System.out.println(raf.readInt());
			}
			
		} 	catch (FileNotFoundException e) {
			// TODO: handle exception
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
