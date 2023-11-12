package ch04_control;

import java.util.Scanner;

public class ExCont03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*중첩 반복문에서 구구단을 가로로 출력
		 * 2 * 3 = 6    2 * 4 =8 
		*/
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
			System.out.print(j + " * " + i + " = " + j * i + "\t");	
			}
			System.out.println ();
		}		
	}
}
