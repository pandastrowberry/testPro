package ch07_oop;

public class PhoneEx1 {

	public static void main(String[] args) {
		/*
		 * 상속
		 * 1. 자손객체의 객체 생성시 부모 객체를 먼저 생성
		 * 2. 자손객체는 부모 객체의 멤버에 접근 가능
		 * 3. 클래스간의 상속은 단일 상속만 가능
		 * 	  자손 클래스의 부모는 하나만 가능
		 * 4. 모든 클래스는 Object 클래스를 상속 받음
		 * 	  모든 객체는 Object 클래스의 객체를 포함
		 *    모든 객체는 Object 클래스의 멤버에 접근 가능 
		 */
		
		MobilePhone sp = new MobilePhone();
		System.out.println(sp.toString());
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("네이버");
		
	}
}
class MobilePhone extends Phone {
	void setApp(String name) {
		if (power)
			System.out.println(name + " 설치 중~~~~");
	}
}

class Phone {
	boolean power;
	void send() {
		if (power) {
			System.out.println("전화걸기");
		}
	}	
	void receive() {
		if (power) {
			System.out.println("전화받기");
		}
	}
}