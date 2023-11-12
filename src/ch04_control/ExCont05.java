package ch04_control;

import java.util.Scanner;

public class ExCont05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*숫자로 이루어진 문자열을 입력 받아 각 자리수 합 출력
		 * String str = scan.next();
		 * str.length() : 문자열 길이
		 * str.charAt(0) => '1'
		 * str.charAt(30) => 사용안됨
		 * 'a' - 'A' = 32
		*/
		
		System.out.println("문자열을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			 System.out.println(str.charAt(i));
			 sum += (str.charAt(i)- '0');
		}
		System.out.println("각 자리수 합 : " + sum);
		System.out.println('a' - 'A');
	}
}	
