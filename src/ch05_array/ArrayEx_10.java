package ch05_array;

import java.util.Scanner;

public class ArrayEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열 복사 : for문을 이용해서 배열 복사
		 * 한번 생성된 배열 객체는 크기 변경x
		 * => collection의 list 객체는 변경 가능
		 */
		int score[] = {90, 80 ,70};
		int score2[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			score2[i] = score[i];
		}
		for (int s : score2) {
			System.out.println(s);
		}

	}
}
