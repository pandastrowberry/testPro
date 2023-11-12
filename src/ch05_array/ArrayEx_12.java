package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * int[] Arrays.copyOf(int[] original, int nextlength)
		 */
		int score1[] = {90, 80 ,70};
		int score2[] = Arrays.copyOf(score1, 5);
		
		for (int s : score2) {
			System.out.println(s);
		}
		
		System.out.println("Arrays.toString(score2)");
		System.out.println(Arrays.toString(score2));
		}
	}
