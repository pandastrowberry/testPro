package ch04_control;

import java.util.Scanner;

public class If_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if문 예제
		 * if(조건식1) {
		 * 	 문장1 => 조건식1의 결과가 참일 때 실행
		 * } else {
		 * 	 문장2 => 조건식1의 결과가 거짓일 때 실행 
		 * }
		 * 
		 * if (조건식1){
		 *		문장1 => 조건식1의 결과가 참일 때 실행
		 * } else if {
		 * 	 문장2 => 조건식1의 결과가 거짓일 때 실행
		 * }
		 * ...
		 * } else {
		 * 	 문장3 => 모든 if문의 결과가 거짓일 때 실행
		 * }
		 */	
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if (score >= 60) 
			System.out.println("합격을 축하합니다");
		else 
			System.out.println("다음에 오세요");
		
		//90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점", 60점 이상이면 "D학점", 그외는 "F학점" 출력
		if(score >= 90) {
			System.out.println("A학점 입니다");
		} else if(score >= 80) {
			System.out.println("B학점 입니다");
		} else if(score >= 70) {
			System.out.println("C학점 입니다");
		} else if(score >= 60) {
			System.out.println("D학점 입니다");
		} else {
			System.out.println("F학점 입니다");
		}
	}

}
