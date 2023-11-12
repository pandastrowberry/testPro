package ch05_array;

import java.util.Scanner;

public class ArrayEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열 복사 : for문을 이용해서 배열 복사
		 * System.arraycopy(from array, 시작번호, to array, 시작번호, 복사 개수)
		 */
		int score1[] = {90, 80, 70};
		int score2[] = new int[5];
		System.arraycopy(score1, 0, score2, 2, score1.length);
		
		for (int s : score2) {
			System.out.println(s);
		}
	}
}
