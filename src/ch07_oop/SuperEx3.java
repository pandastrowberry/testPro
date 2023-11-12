package ch07_oop;

public class SuperEx3 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		System.out.println(p.x);
		System.out.println("=========");
		p.method();
		Child3 c = new Child3();
		System.out.println(c.x);
		System.out.println("==========");
		c.method();
	}
}

class Parent3 {
	int x = 10;
	void method() {
		System.out.println("Parent 메소드");
	}
}

class Child3 extends Parent3{
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("Chld 메소드");
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}