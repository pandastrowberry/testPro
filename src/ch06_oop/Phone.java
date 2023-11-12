package ch06_oop;

public class Phone {
	String color;
	boolean power;
	String no;
	void  power() {
		power = !power;
	}
	
	void send(String no) {
		System.out.println(no + "로 전화 송신중---");
	}
	
	void receive(String no) {
		System.out.println(no + "로 전화 수신중---");
	}
}
