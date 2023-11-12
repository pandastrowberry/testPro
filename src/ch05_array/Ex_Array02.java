package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Math.random 함수를 이용해서 1~ 10까지 임의의 수를 배열에 10개 저장
		 * 배열에 저장된 수만큼 * 출력
		 * 0 <= Math.random() < 10
		 * arr = {3, 5, 2, 1]
		 * 3 : ***
		 * 5 : *****
		 */
	     int arr [] = new int [10];
	     for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		for (int a : arr) {
			System.out.print(a + " :");
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	  }
}