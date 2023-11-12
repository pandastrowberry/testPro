package ch06_oop;

class Value {int val;}

public class ParameterEx1 {
	public static void main(String[] args) { //클래스 메소드
		/* 
		 * 매개변수(Parameter)예제
		 * 기본형 매개변수 : read only(읽기만 가능)
		 * 참조형 매개변수 : read & write(읽고, 쓰기 가능)					   	           	
		 */
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("2 : change1() : " + v.val);
		change2(v);
		System.out.println("4 : change2(주소) 이후 : " + v.val);
		
		
	}	
	
	static void change1(int val) {
		val += 100;
		System.out.println("1 : change1() : " + val);
	}
	
	static void change2(Value v) {
		v.val += 100;
		System.out.println("3 : change2() : " + v.val);
	}
	
	
}