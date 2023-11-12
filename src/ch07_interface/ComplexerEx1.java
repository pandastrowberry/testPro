package ch07_interface;

public class ComplexerEx1 {
	
	public static void main(String[] args) {
		/*
		 *인터페이스의 멤버는 상수, 추상메소드, default메소드, static 메소드만 가능 
		 * [public static final] 자료형 상수
		 * [public abstract] 자료형 메소드명() 
		 * [public] default 자료형 메소드명() {} => jdk 8.0 이후에서만 가능
		 * [public] static 자료형 메소드명() {} => jdk 8.0 이후에서만 가능
		 * 
		 * 인터페이스의 멤버의 접근 제어자는 public
		 * 객체화x -> 구현 클래스로 객체화
		 * 클래스와 인터페이스간 구현 (다중 구현 가능)
		 * 인터페이스간 상속은 다중 상속 가능
		 * */

		
		Complexer com = new Complexer();
		System.out.println("기본 잉크량 : " + Printerable.INK);
		System.out.println("FAX 번호 : " + Complexerable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
		
		System.out.println("===========");
		
		if (com instanceof Complexerable) {
			System.out.println("===== com 참조변수의 객체는 Complexer 입니다");
		}
		if (com instanceof Printerable) {
			System.out.println("===== com 참조변수의 객체는 Printable 입니다");
		}
		if (com instanceof Scannerable) {
			System.out.println("===== com 참조변수의 객체는 Scannerable 입니다");
		}
		if (com instanceof Faxable) {
			System.out.println("===== com 참조변수의 객체는 Faxable 입니다");
			com.receive("02-5678");
			com.send("02-5678");
		}
		
	}
}

interface Printerable {
	int INK = 10;
	void print();
}

interface Scannerable {
	void scan();
}

interface Faxable {
	String FAX_NO = "010-12345";
	void send(String tel);
	void receive(String tel);
}

interface Complexerable extends Printerable, Scannerable, Faxable {
	
}

class Complexer implements Printerable, Scannerable, Faxable {
	int ink;
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량 : " + --ink);
	}
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}	

	public void send(String tel) {
		System.out.println(FAX_NO + "에서" + tel + "번호로 FAX 전송");
	}
	
	public void receive(String tel) {
		System.out.println(tel + "에서" + FAX_NO + "로 FAX 수신");
	}
}

