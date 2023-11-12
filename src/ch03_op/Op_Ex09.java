package ch03_op;

import java.util.Scanner;

public class Op_Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*조건 연산자(삼항 연산자, 조건문으로 변경 가능)
		 * (조건식)?참 : 거짓
		 */
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score >= 60)? "합격" : "불합격";
		System.out.println(score + "점은" + result + "입니다.");
	}

}
