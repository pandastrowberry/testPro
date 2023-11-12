package ch07_oop;

public class BikeEx2 {

	public static void main(String[] args) {
		AutoBike2 auto = new AutoBike2(2);
		System.out.println("가격은 " + auto.price + "만 원입니다.");
		auto.drive();
		auto.stop();
		auto.power();
		System.out.println("============");
		Bike2 bike = auto;
		System.out.println("가격은 " + bike.price + "만 원입니다.");
		bike.drive();
		bike.stop();
		//bike.power();
	}
}

class Bike2 {
	int wheel;
	int price = 10;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	
	void drive () {
		System.out.println("bike 페달을 밟는다");
	}
	void stop() {
		System.out.println( "bike 브레이크를 잡는다.");
	}
}

class AutoBike2 extends Bike2 {
	boolean power;
	int price = 200;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power =!power;
	}
	@Override
	void drive() {
		if (!power) power();
			System.out.println(this.price + "원 : 출발버튼을 누른다");
			System.out.println(super.price + "원 : 출발버튼을 누른다");
		}
	
	@Override
	void stop() {
		if (power) {
			System.out.println("정지 버튼을 누른다");
	} else {
		System.out.println("이미 정지되어 있음.");
   }
 }
}	