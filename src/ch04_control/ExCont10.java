package ch04_control;

import java.util.Scanner;

public class ExCont10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력
		 	3
		 	***
		 	**
		 	*
		 */	
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(); 	
		
		for (int i = len; i >= 1; i--) {
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}			