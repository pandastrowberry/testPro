package ch06_oop;



public class ConstructorEx3 {
	public static void main(String[] args) {
		/*
		 * 생성자도 오버로딩 가능	
		 */
		 
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("blue");
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
	}
}

class Car3 {
	String color; //색깔 
	String gearType; //변속기 종류 - auto, manual
	int door; //문 개수
	
	//생성자 toString() 구현
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(String color) {
		this(color, "auto", 4);
	}

	
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car3 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}