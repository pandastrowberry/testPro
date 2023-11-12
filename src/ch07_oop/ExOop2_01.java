package ch07_oop;

public class ExOop2_01 {
	public static void main(String[] args) {
		/*
		 * 1. Animal 클래스 => 추상클래스
		 * 	  멤버변수 : 동물의 종류(type), 다리수(leg)
		 * 	  생성자 : 동물의 종류와 다리 수 입력
		 * 	  멤버 메소드 : void sound() => 추상 메소드	
		 * 				void eat() => 추상 메소드
		 *    Dog 클래스 : Animal 자손 클래스
		 * 	  			생성자 매개변수x
		 * 	  멤버 메소드 : void sound() => "멍멍"
		 * 				void eat() => "주인이 주는대로 먹는다"
		 *    Lion 클래스 : Animal 자손 클래스
		 *    			 생성자 매개변수x
		 *    멤버 메소드 : void sound() => "어흥"
		 *    			void eat() => "초식동물을 잡아 먹는다 " 			 		
		 * 
		 * */
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Lion();
		for (Animal a : animal) {
			System.out.print(a.type + " => ");
			a.sound();
			a.eat();
		}
	}
}

abstract class Animal {
	String type;
	int leg;
	Animal (String type, int leg) {
		this.type = type;
		this.leg = leg;
	}
	
	abstract void sound();
	
	abstract void eat();
}

class Dog extends Animal {
	Dog() {
		super("Dog", 4);
	}
	void sound() {
		System.out.println("멍멍");
	}
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}
}

class Lion extends Animal {
	Lion() {
		super("Lion", 4);
	}
	void sound() {
		System.out.println("어흥");
	}
	void eat() {
		System.out.println("초식동물을 잡아 먹는다");
	}
}