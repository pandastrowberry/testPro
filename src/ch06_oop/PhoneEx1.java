package ch06_oop;

public class PhoneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 클래스(설계도): 사용자 정의 자료형
		 * 			  속성 : 멤버변수
		 *			  기능 : 멤버메소드	 
		 */
		
		/* Phone p1 -> 참조변수 선언
		 * new Phone() -> 객체 생성, 객체화, 인스턴스화
 		 * new 예약어 -> 객체 생성 가능, 메모리 할당 (String을 제외하고 모든 클래스의 객체 생성은 new 연산자로 가능)
		 */
		Phone p1 = new Phone();
		p1.color = "검정";
		p1.power = true;
		p1.no = "01023456789";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01023456789");
		p1.receive("01023456789");
		
		Phone p2 = new Phone();
		/*
		 * new 예약어 기능
		 * 1. 힙(heap)(<-> 스택(stack))영역에 메모리 할당
		 * 2. 멤버변수를 기본값으로 초기화 기본값 : 숫자 : 0, boolean : false, 그외 : null
		 * 3. 생성자 호출가능 
		 */
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2 = p1; //주소의 개념 이해
		
		/*
		 * p1과 p2는 같은 객체
		 * 하나의 객체는 두 개의 참조변수가 참조 가능(하나의 주소 공유)
		 * 하나의 참조변수가 두 개의 객체는 참조 불가
		 */
		
		System.out.println(p2.color + ", " + p2.power + "," + p2.no);
		
	}	
}
