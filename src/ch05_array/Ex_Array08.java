package ch05_array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ex_Array08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~ 9까지 숫자를 입력하세요 끝내려면 -1을 입력하세요.
		 * (결과)
		 * 입력값 : 1234
		 *  **    *****  *****    **
		 *   *        *      *   * *
		 *   *    *****  *****  *  * 
		 *   *    *          *  *****
		 *  ***   *****  *****     *
		 */	
			
		//1~ 9까지 입력 받기
		//-1이면 끝내기 (while)
		//조건문
		//반복문
		//row, column 정하기
		
		String neonNumber[][] = { { "*****", "*   *", "*   *", "*   *", "*****" },
	            { " **  ", "  *  ", "  *  ", "  *  ", " *** " }, { "*****", "    *", "*****", "*    ", "*****" },
	            { "*****", "    *", "*****", "    *", "*****" }, { "  ** ", " * * ", "*  * ", "*****", "   * " },
	            { "*****", "*    ", "*****", "    *", "*****" }, { "*****", "*    ", "*****", "*   *", "*****" },
	            { "*****", "*   *", "*   *", "    *", "    *" }, { "*****", "*   *", "*****", "*   *", "*****" },
	            { "*****", "*   *", "*****", "    *", "    *" } };
		
		String temp = " ";
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1에서 9까지의 숫자를 입력하세요" + " 끝내려면 -1을 입력하세요");
			temp = scan.next();
			if (temp.equals("-1")) {
				System.out.println("end");
				break;
			}
			
			System.out.println("입력 값 : " + temp);
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < temp.length(); j++) {
					int index = temp.charAt(j) - '0';
				System.out.print(neonNumber[index][i] + "\t");
			}
				System.out.println();
		   }
		}
	}
}	
