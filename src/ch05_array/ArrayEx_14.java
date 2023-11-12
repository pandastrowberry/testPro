package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10진수 -> 2진수
		 */
		int[] binary = new int[32];
		int digit = 2;
		System.out.println(digit + "진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		while (divnum != 0) {
			binary[index++] = divnum % digit;
			divnum /= digit;
		}
		
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i] + " ");
		}
		System.out.println();
		}
	}