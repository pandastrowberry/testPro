package ch07_oop;

public class SuperEx2 {

	public static void main(String[] args) {
		/*
		 * super() 생성자 : 부모 클래스의 생성자 호출시 사용
		 */
		Child2 c = new Child2();
		//c.method();
	}
}

class Child2 extends Parent {
	int x = 20;
	Child2() {
		super(10);
	}

void method() {
	int x = 30;
	//x : 1. 지역변수 -> 2.현재 클래스의 멤버 중x -> 부모클래스의 객체의 멤버 중x
	System.out.println(x);
	//1. 현재 클래스의 멤버 중x -> 부모클래스의 객체의 멤버 중x
	System.out.println(this.x);
	//부모 클래스의 객체의 멤버 중x
	System.out.println(super.x);
	}//100
}

class Parent {
	int x = 10;
	Parent(int x) {
		this.x = x;
	}
	/*Parent() {
		x = 400;*/
}