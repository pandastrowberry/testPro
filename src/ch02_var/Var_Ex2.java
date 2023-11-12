package ch02_var;

public class Var_Ex2 {
	public static void main(String[] args) {
		/* 형변환 
		   큰 자료형 <= 작은 자료형 : 자동 형변환
		   작은 자료형 <= 큰 자료형 : 명시적 형변환
		   byte < short < int < long < float < double
		          char    
		   a = b (우측을 좌측에 입력(대입))
		   left value(a) : 대입연산자의 왼쪽 값(반드시 변수)
		   right value(b) : 대입연산자의 오른쪽 값(변수, 리터럴, 수식 (method return))*/
		
		int a = 10;
		char aa = 'a'; //'문자 하나', 기본형 
		//참조형과 기본형은 형변환 불가
		String S = "a"; // "문자열", 참조형이므로 기본형 char로 변환x(wrapper 제외)
		//boolean을 제외한 기본형은 서로 형변환 가능
		byte b1 = (byte)255; //255 : 1(sign 비트, 부호결정, 1이면 음수)1111111 -> 1111 -> 111-111+1(보수 계산)-> -1 
		int i1 = b1;//int <= byte 자동 형변환
		byte b2 = (byte)i1; //byte 명시적 형변환
		System.out.println("b1 = " + b1 + ", i1 = " + i1 + ", b2 = " + b2 );
		
		
		byte b3 = 100;
		System.out.println("b3 = " + b3);
		long l1 = 10;
		float f1 = l1;
		long l2 = (long)f1;
		
		char c1 = 'A';
		short s1 = (short) c1;
		char c2 = (char) b1;
		int ii = c1;
		
		
	}
}
