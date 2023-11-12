package ch03_op;

import java.util.Scanner;

public class ExOp_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*화면에서 3자리 정수를 입력받아 100 자리 미만을 버리고 출력
		  (결과)
		  세자리 정수를 입력하시오
		  321
		  300
		  
		  세자리 정수를 입력하시오
		  199
		  100	
		*/
		int num;
		System.out.println("세자리 정수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println(num / 100  * 100);
	}

}
