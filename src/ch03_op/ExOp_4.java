package ch03_op;

import java.util.Scanner;

public class ExOp_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*숫자를 입력받아서 양수이면 양수로, 음수면 음수로, 0이면 0으로 출력
		 * */
		
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println((num > 0)? "양수" : (num < 0)? "음수" : "0");	
	}

}
