package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10진수를 입력받아 16진수로 출력
		 * 단, 10~ 15 -> 'A'~ 'F'
		 */
		
		char[] binary = new char[32];
		char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		int digit = 16;		
		
		System.out.println(digit + "수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		
		int index = 0;
		while(divnum != 0) {
			binary[index++] = data[divnum % digit]; 
			divnum /= digit;
		}
		
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i] + " ");
		}
		System.out.println();
	}
}
