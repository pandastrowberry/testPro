package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 화면에서 5개의 점수를 입력받아 점수의 합계, 평균, 최대점수, 최소점수 출력
		 * 입력받은 점수는 score 배열에 저장
		 */
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0, avg = 0, min = 0, max = 0;
		System.out.println("다섯개의 정수를 입력하세요");
		for (int i = 0; i < 5; i++) {
			score[i] = scan.nextInt();
			sum += score[i];
			if (i == 0) min = score[i];
			if (max < score[i]) max = score[i];
			if (min > score[i]) min = score[i]; 
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
		System.out.println("최대 점수 : " + max);
		System.out.println("최소 점수 : " + min);

		}
	}
