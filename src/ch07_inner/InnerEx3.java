package ch07_inner;

public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		ii.method1();
	}
}

//내부 클래스 객체에서 사용되는 this
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv = " + iv);
			System.out.println("this.iv = " + this.iv);
			//Outer3 클래스 멤버 변수의 값
			this.iv = 50;//변경 가능
			System.out.println("Outer3.this.iv = " + Outer3.this.iv);
		}
	}
}