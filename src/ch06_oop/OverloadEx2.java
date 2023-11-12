package ch06_oop;

class Math4 {
	int add(int a, int b) {
		System.out.print("int int  메소드 결과 : ");
		return a + b;
	}
	
	/*
	 * int add(int x, int y) [
	 * System.out.print("int int 메소드 결과 : ");
	 * return x + y;
	 * }
	 */
	
	long add(long a, int b) {
		System.out.print("long int 메소드 결과 : ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("int long 메소드 결과 : ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long long 메소드 결과 : ");
		return a + b;
	}
}

public class OverloadEx2 {
	public static void main(String[] args) {
		/*
		 * 오버로딩된 메소드 선택 기준
		 * 1. 호출시 입력된 자료형과 선언부의 선언된 자료형이 동일한 메소드 선택
		 * 2. 1의 조건이 없으면
		 *    최소 개수로 자동형변환이 되는 매개변수로 가진 메소드 선택
		 * 3. 주의사항 
		 * 	  최소 개수로 자동형변환이 되는 메소드가 여러개인 경우 오류 생김
		 * 
		 * 오버로딩 조건
		 * 1. 메소드명이 같고
		 * 2. 매개변수 목록이 같고
		 * 	   
		 * 리턴타입, 접근제어자와 무관
		 */
		
		Math4 m = new Math4();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(10, 10L));
		System.out.println(m.add(10L, 10));
		System.out.println(m.add(10L, 10L));
		

	}
}	