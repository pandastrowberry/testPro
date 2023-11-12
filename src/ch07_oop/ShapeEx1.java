package ch07_oop;

public class ShapeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 추상 클래스(abstract class)
		 * 추상 메소드를 가질 수 있는 클래스 (abstract 예약어로 구현)
		 * 객체화x -> 객체화는 반드시 상속을 통해 자손 클래스의 객체화로 객체화가 가능
		 * 이때 자손 클래스에서는 추상 메소드를 반드시 오버라이딩
		 * 그외는 일반클래스와 동일(생성자, 멤버변수, 멤버메소드)
		 * 업무의 표준화할 때 사용
		 * 
		 * 추상 메소드
		 * 선언만 존재하는 메소드(구현x)
		 * 자손크래스에서 반드시 오버라이딩
		 * 추상클래스간 상속 가능
		 */
		
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}
}

//추상클래스
//추상 메소드(body) 있음
abstract class Shape {
	String type;
	
	Shape(String type) {
		this.type = type;
	}
	
	abstract double area();

	abstract double length();
}

class Circle extends Shape {
	int r;
	
	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	double area() {
		return Math.PI * r * r;
	}

	@Override
	double length() {
		return Math.PI * r * 2;
		
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + " , type =  " + type + "]" + ", 넓이 : " + area() + ", 둘레 : " + length();
	}
}

class Rectangle extends Shape {
	int width, height;
	
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
		
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return (width + height) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height +  " , type =  " + type + "]" + ", 넓이 : " + area() + ", 둘레 : " + length();
	}
}
