package ch07_interface;

public class DefaultInterfaceEx1 {
	public static void main(String[] args) {
		/*
		 * default 메소드 : 인스턴스 멤버
		 * 				 구현 객체에 다중 구현 가능 => 똑같은 default 메소드 존재
		 * 				 조건에 따라 오버라이딩 가능
		 * static 메소드 : 클래스 멤버
		 * 
		 * MyInterface1, MyInterface2 인터페이스로 method1 default 메소드가 충돌 발생 => Child 클래스에서 반드시 오버라이딩
		 * */
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메소드 : method2()");
	}
}

class Child extends Parent implements MyInterface2, MyInterface1 {
	public void method1() {
		System.out.println("Child 클래스의 method1() 메소드");
	}
	public void method() {
		System.out.println("Child 클래스의 method() 메소드");
		System.out.println("MyInterface1, MyInterface2 인터페이스의 추상메소드 method 오버라이딩");
	}
	
}

interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 디폴트 메소드 : method()");
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메소드 : staticMethod()");
	}
}

interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 디폴트 메소드 : method()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메소드 : staticMethod()");
	}
}