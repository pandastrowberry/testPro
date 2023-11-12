package ch04_control;

import java.util.Scanner;

public class ExCont13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력
		 3	
		 	*
		   ***
		  *****
		 */	
		System.out.println("삼각형 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(); 	
		
		for (int i = 1; i <= len; i++) {
			for (int j = 0 ; j <= len * 2 - 1; j++){
				if ( len - i <  j && j < len + i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println();
	 }
  }
}	