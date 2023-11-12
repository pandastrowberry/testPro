package ch02_var;

public class Var_Ex1 {
	public static void main(String[] args) {
		/*
		 실수형 리터럴의 기본형은 double형
		 float 리터럴로 표시하기 위해서는 접미사 붙임
		 F, f : float
		 D, d : double
		 L, l : long
		 
		 자료형 - 기본형- 논리형 : boolean(1bit)
		 	         문자형 : char(2)
		 	         정수형 : byte(1), short(2), long(8)
		 	         실수형 : float(4), double(8)
		 	   참조형 - 배열, 클래스, 인터페이스
		*/
		
		//변수 선언 초기화
		byte b1 = -22;
		byte b2; //변수의 선언, b2 저장공간 메모리 1바이트(8bit) 할당, 바이트로 저장할 수 있는 값의 범위 : -128~ 127 저장 가능
		//정수 리터럴은 기본 int
		b2 = -128; //변수 초기화
		
		b1 = 127;
		
		short s1 = -226; //2바이트
		int i1 = 100; //4바이트
		long l1 = 1000; //8바이트
		int i2 = (int)l1;
		
		//실수 리터럴은 기본 double
		double c1 = 1.2;
		float f1 = 1.0f;//float f1 = (float)1.0;
		f1 = l1;
		
		double d1 = 1.0;
		double d12 = 1L;
		
		//변수 값 출력
		System.out.println("b1 = " + b1); //b1 = -22(auto casting)
		System.out.println("s1 = " + s1);
		System.out.println("i1 = " + i1);
		System.out.println("l1 = " + l1);
		System.out.println("f1 = " + f1);
		System.out.println("c1 = " + c1);
		
	}
}
