package ch03_op;

import java.util.Scanner;

public class ExOp_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*원의 반지름을 입력받아 면적과 둘레 구하기
		 *  반지름 : 5
		 *  (힌트) 원주율은 3.141592
		 * 
		 * (결과) 면적 = 78.5398 둘레 = 31.41592
		 * 
		 */
		
		System.out.println("반지름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double pi = 3.141592;
		
		//System.out.println("면적 = " + r * r * pi + " 둘레 = " + r * 2 * pi); //면적 = 78.5398둘레 = 31.41592
		System.out.println("면적 = " + Math.pow(r, 2) * pi + "둘레 = " + r * 2 *pi);
	}

}
