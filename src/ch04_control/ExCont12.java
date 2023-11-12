package ch04_control;

import java.util.Scanner;

public class ExCont12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력
		 3	
		 	***
		 	 **
		      *
		 */	
		System.out.println("삼각형 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); 	
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++){
					if (j < i) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}		
			}
			System.out.println();
		}
	}
}			