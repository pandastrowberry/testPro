package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~ 10 사이 임의의 수 100개를 입력받아 각 수별 나온 횟수만큼 "*" 출력
		 * 
		 * 3 9 2 1 5 1 8 9 5 6
		 * 1 : **
		 * 2 : *
		 * 3 : *
		 * ...
		 */
		 
		 int arr[] = new int [10];
		 for (int i = 0; i < 100; i++) {
			 int temp = (int)(Math.random()*10) + 1;
			 arr[temp - 1] ++;
		}
		 for (int j = 0; j < 10 ; j++) {
			System.out.print((j +1 ) + "-" + arr[j] + " : ");
			for (int i = 0; i < arr[j]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
