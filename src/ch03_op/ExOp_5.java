package ch03_op;

import java.util.Scanner;

public class ExOp_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*한개의 문자를 입력받아서 소문자인 경우에는 대문자로 변경하여 출력
		 * 소문자가 아니면 "소문자아님" 출력
		 * 
		 * char ch = str.charAt(0);
		 * ch 범위 : 'a <= ch <= z'
		 * 대문자 = 소문자 -32;
		 * 
		 * (결과)
		 * 한개의 문자를 입력하세요
		 * a
		 * A
		 * 
		 * 한개의 문자를 입력하세요
		 * I
		 * 소문자 아님
		 * */
		
		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		System.out.println(('a' <= ch && ch <= 'z')? (char)(ch -32) : "소문자 아님");
	}

}
