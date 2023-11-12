package ch06_oop;

class Math2 {
	int a, b; // 인스턴스변수
	int x;
	int add1() {	
		for (int i = 0; i < 5; i++) {		
		int x = 7;
		}
		System.out.println(x);
		return a + b;
	}

	static int add2(int a, int b) {
		int x = 5;
		return a + b;}
	}
	
public class MethodEx2 {
	public static void main(String[] args) { //클래스 메소드
		/* 멤버 메소드 구성
		 * 클래스(static) 메소드 : 클래스 정보 로드될 때 메소드의 호출 가능
		 *					  클래스명.메소드명() 	
	     * 인스턴스 메소드 : 객체화가 되어야 메소드의 호출 가능 참조변수명.메소드명()           	
		 */
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		
		System.out.println(m.add1());
		System.out.println("l=============");
		System.out.println(m.add2(100, 100));
		System.out.println(m.x);
		System.out.println("2==============");
		System.out.println(Math2.add2(100, 200));
	}	
}