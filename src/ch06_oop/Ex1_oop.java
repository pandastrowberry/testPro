package ch06_oop;


public class Ex1_oop {
		public static void main(String[] args) {
			/*
			 * 1) 가로 * 세로의 변수를 가지고 있는 직사각형 클래스 만들기
			 * 
			 * 모든 멤버의 접근제한자는 생략
			 * 모든 멤버는 Instance 멤버
			 * 멤버 메소드는 넓이를 출력하는 영역, 둘레를 출력하는 길이를 가진다
			 * 
			 * 
			 * (출력)
			 * 넓이 : 10 * 5
			 * 둘레 : (10 + 5) * 2
			 */
			
			Rectangle r1 = new Rectangle();
			r1.width = 10;
			r1.height = 5;
			System.out.println("넓이");
			r1.area();
			System.out.println("둘레");
			r1.length();
			
			Rectangle r2 = new Rectangle();
			r2.width = 20;
			r2.height = 30;
			System.out.println("넓이");
			r2.area();
			System.out.println("둘레");
			r2.length();
		}
    }

class Rectangle {
	int width;
	int height;
	Rectangle() {
		
	}
	
	Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	void area() {
		System.out.println("넓이 : " + width + " * " + height + " = " + (width) * height);
	}
	
	void length () {
		System.out.println("둘레 : " + "(" + width + " + " + height + ")" + " * 2 = " + (width + height) * 2);
	}
}

