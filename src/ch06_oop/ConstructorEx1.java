package ch06_oop;

class Number1{
	int num;
}

class Number2{
	int num;
	
	/*
	 * Number2() {}
	 */
	
	Number2(int x) {
		num = x;
		
	}
}


public class ConstructorEx1 {
	public static void main(String[] args) {
		/*
		 * 생성자(Constructor) : 객체화시 호출되는 메소드
		 * 					   생성자없이 객체 생성x
		 *                     기능은 인스턴스 변수의 초기화 담당
		 * 생성자 구현
		 * 1. 생성자명 = 클래스명 
		 * 2. 리턴타입 적지 않는다 
		 * 
		 * 기본 생성자 : 클래스에 생성자를 하나도 구현하지 않으면 컴파일러가 추가해주는 생성자
		 * 			 public 클래스명(){} 	
		 */
		 
		Number1 n1 = new Number1();
		n1.num = 10;
		//Number2 n2 = new Number2();
		Number2 n3 = new Number2(20);
		System.out.println("Number1 클래스의 num = " + n1.num);
		//System.out.println("Number2 클래스의 num = " + n2.num);
		System.out.println("Number2 클래스의 num = " + n3.num);
		
	}
}	