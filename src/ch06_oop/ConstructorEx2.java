package ch06_oop;



public class ConstructorEx2 {
	public static void main(String[] args) {
		/*
		 * 생성자도 오버로딩 가능	
		 */
		 
		Car c1 = new Car("blue", 1234);
		Car c2 = new Car("red");
		Car c3 = new Car(1234);
		Car c4 = new Car(c3);
		System.out.println("c1 : " + c1); //참조변수이기 때문에 ToString 오버라이딩 해야
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
	}
}

class Car{
	
	String color;
	int number;
	
	Car(String color, int n) {
		this.color = color; //이름이 같을 때 클래스 영역 지정
		number = n;
	}
	
	Car(String color) {
		this.color = color;
		number = 1;
	}
	
	Car(int n) {
		this.color = "white";
		number = n;
		
	}
	
	Car(Car c) {
		this.color = c.color;
		number = c.number;
		
	}

	@Override
	public String toString() {
		return "Car [color = " + color + ", number = " + number + "]";
	}	
}