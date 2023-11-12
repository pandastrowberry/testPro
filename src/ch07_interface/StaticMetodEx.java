package ch07_interface;

public class StaticMetodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = new B();
		
		System.out.println("====");
		a.method();
		b.method();
	}
}

class A {
	static void method() {
		System.out.println("A");
	}
}

class B extends A{
	static void method() {
		System.out.println("B");
	}
}
