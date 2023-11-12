package ch07_oop;

public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new FireEngine(); //100번지
		Car car2 = null;
		FireEngine fe = null;
		car1.drive();
		//fe = car1; casting 해야
		//fe = (FireEngine) car1; //런타임 에러
		//fe.drive(); //fire Engine이 null이어서(주소 못찾음)
		fe = (FireEngine) car1;
		fe.drive();
		car2 = fe;
		//car2.water();
		car2.drive();
		
	}

}

class Car {
	String color;
	int door;
	void drive() { //운전 기능
		System.out.println("drive, Brrr-");
	}
	void stop() { //정지 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { //소방차
	void water() { //소화 기능
		System.out.println("Water!!!");
	}
}
