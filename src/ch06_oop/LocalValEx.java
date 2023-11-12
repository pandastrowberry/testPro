package ch06_oop;

public class LocalValEx {
	static String grade2;
	public static void main(String[] args) {
		/*
		 * 지역변수 : 메소드 내부에서 선언된 변수
		 *         반드시 초기화 
		 * 		   매개변수 = 지역변수	
		 */
		
		//args : 지역변수
		int num = 0; //지역변수
		boolean b = true; //지역변수
		if(b) num = 100; //else num = 99;
		System.out.println(num);
		String grade;
		int score = 80; //지역변수
		switch (score / 10) {
			case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			default : grade = "F"; 
		} System.out.println("학점 : " + grade);
	}	
}
