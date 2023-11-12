package ch06_oop;

class Math3{
	int a = 100;
	
	/*int add(int b) {
		System.out.print("1 : ");
		return a + b;
	}*/
	
	double add(float b) {
		System.out.print("2 : ");
		return a + b;
	}
	
	double add(double b) {
		System.out.print("3 : ");
		return a + b;
	}
	
	double add(long b) {
		System.out.print("4 : ");
		return a + b;
	}
	
	String add(String b) {
		System.out.print("5 : ");
		return a + b;
	}
	
}

public class OverloadEx1 {
	public static void main(String[] args) {
		/*
		 * 오버로딩 예제
		 * 같은 클래스 내부엣서 같은 이름을 가진 메소드가 여러개 존재 가능
		 * 단, 매개변수의 자료형의 개수 순서, 타입 다르게 -> 매개변수명이 아닌 자료형으로 판단 
		 */
		
		Math3 m = new Math3();
		System.out.println(m.add(10));
		System.out.println(m.add(10.3));
		System.out.println(m.add("번"));
		
		
		
		
		
		
	
	}
}	