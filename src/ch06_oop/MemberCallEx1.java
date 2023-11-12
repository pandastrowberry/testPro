package ch06_oop;

public class MemberCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; //클래스멤버 호출
	int iv1 = 100;
	int iv2 = iv1; //인스턴스 멤버 호출
	int iv3 = cv1; //인스턴스 멤버에서 클래스 멤버 호출
	
	//static int cv3 = iv1; //클래스 멤버에서 인스턴스 멤버 호출(객체화 필요)
	static int cv3 = new MemberCallEx1().iv1; 
	
	public static void main(String[] args) {
		
		//cv1 = iv1; //static이 먼저 나옴(클래스 멤버인 main 메소드에서 iv1 인스턴스 멤버 접근 x)
		cv1 = new MemberCallEx1().iv1;
		
		//iv1 = cv1; 
		new MemberCallEx1().iv1 = cv1;
		//method1(); //주소 달아서 봐야
		new MemberCallEx1().method1();
		method2();
	}	
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
	}
	
	static void method2() {
		System.out.println(cv1 + cv2);
		//System.out.println(iv1 + iv2);
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println(m.iv1 + m.iv2);
	}
	
}	