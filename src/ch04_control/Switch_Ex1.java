package ch04_control;

import java.util.Scanner;

public class Switch_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수를 입력받아 A~ F학점 출력하기
		 * switch(변수, 수식) {
		 * 	case 값1 : 문장1; break;
		 *  ...
		 *  default : 문장;
		 * }
		 * 
		 * break : break가 속한 switch문, 반복문에서 빠져 나옴
		 */
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("정수를 입력하세요");
		 int score = scan.nextInt();
		 
		 String grade;
		 switch (score / 10) {
		 	case 10 : grade = "A"; break;
		 	case  9 : grade = "B"; break;
		 	case  8 : grade = "C"; break;
		 	case  7 : grade = "D"; break;
		 	default : grade = "F"; break; 
		 }
		 System.out.println(grade + "학점");
	}

}
