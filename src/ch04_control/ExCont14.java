package ch04_control;

import java.util.Scanner;

public class ExCont14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*입력받은 문자가 좌우대칭수인지 판단
		 *문자를 입력하세요
		 *121
		 *좌우대칭수
		 *123 (<-> 321)
		 *좌우대칭수 아님
		 *1 2 3 4 5 4 3 2 1 
		 */	
		System.out.println("문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		boolean chk = true;
		
		for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i)+ " = " + str.charAt(str.length()-1-i));
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				chk = false;
				break;
			}
		}
			if (chk) {
				System.out.println("좌우대칭수이다");
			}
			else {
				System.out.println("좌우대칭수 아니다");
		}
	 }
  }