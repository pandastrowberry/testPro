package ch07_oop;

import javax.sound.midi.SysexMessage;

public class ExOop2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 모든 식품은 가격과 포인트를 멤버로 가짐
		 * 식품의 객체 생성시 가격을 입력받고, 가격의 10%를 포인트로 저장
		 * 식료품의 종류는 과일, 음료, 과자로 구분
		 * 
		 * 과일 클래스는 당도, 음료는 용량, 과자는 무게를 멤버로 가짐
		 * 
		 * 과일의 종류는 사과, 복숭아
		 * 음료의 종류는 콜라, 사이다
		 * 과자의 종류는 비스킷, 쿠키
		 * 
		 * 사과, 복숭아, 콜라, 사이다, 비스킷, 쿠키 클래스에 toString()의 메소드를 구현하고, 각각의 이름 리턴
		 * 
		 * 사과와 복숭아 생성시 가격, 당도 
		 * 콜라와 사이다 생성시 가격, 용량 
		 * 비스킷과 쿠키 생성시 가격, 무게 입력받아 객체 생성
		 * 
		 * Food, Fruit, Drink, Snack, Apple, Peach, Coke, Cider, Biscuit, Cookie 클래스
		 * 10개 구현
		 * */
		
		Apple apple = new Apple(1000, 10.5); //가격, 당도
		System.out.println("사과 가격 : " + apple.price);
		System.out.println("사과 당도 : " + apple.brix);
		
		Peach peach = new Peach(1000, 13.5); //가격, 당도
		Coke coke = new Coke(500, 500); //가격, 용량
		Cider cider = new Cider(1500, 1000); 
		Biscuit bis = new Biscuit(1000, 500); //가격, 무게
		Cookie cookie = new Cookie(500, 5000);
		System.out.println("============");
		System.out.println(apple);
		System.out.println(peach);
		System.out.println(coke);
		System.out.println(cider);
		System.out.println(bis);
		System.out.println(cookie);
	}
}

class Food {
	int price, point;
	public Food(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

class Fruit extends Food {
	double brix;
	public Fruit(int price,  double brix) {
		super(price);
		this.brix = brix;
	}
	
}

class Drink extends Food{
	int ml;
	public Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
}

class Snack extends Food {
	int gram;
	public Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
}

class Apple extends Fruit {
		Apple(int price, double brix) {
			super(price, brix);
			
		}

		@Override
		public String toString() {
			return "사과";
		}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
		
	}

	@Override
	public String toString() {
		return "복숭아";
	}
}

class Coke extends Drink {
	Coke(int price, int ml) {
		super(price, ml);
		
	}

	@Override
	public String toString() {
		return "콜라";
	}
}

class Cider extends Drink {
	Cider(int price, int ml) {
		super(price, ml);
		
	}

	@Override
	public String toString() {
		return "사이다";
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
		
	}

	@Override
	public String toString() {
		return "비스킷";
	}
}

class Cookie extends Drink {
	Cookie(int price, int gram) {
		super(price, gram);
		
	}

	@Override
	public String toString() {
		return "쿠키";
	}
}