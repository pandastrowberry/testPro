package ch07_inner;

public class InnerEx4 {
	public static void main(String[] args) {
		I i = new I() {
		int iv = 100;
		@Override
		public void test() {
			System.out.println("iv = " + iv);
			System.out.println("this.iv = " + this.iv);
			System.out.println("I 내부 클래스의 test 메소드");
				}
			};	
		i.test();
		
		I i2 = new IInner(); //Implements I
		i2.test();
		
		//Abs a = new Abs(); 인터페이스와 동일하게 new로 생성x 
		Abs a = new Abs() {
			int iv = 100;
			@Override
			void test() {
				System.out.println("iv = " + iv);
				System.out.println("this.iv = " + this.iv);
				System.out.println("abs 내부 클래스의 test 메소드");
			}
		};
		a.test();
	}
}
interface I {
	void test();
	}
abstract class Abs {
	abstract void test();
}
class IInner implements I {
	int iv = 100;
	@Override
	public void test() {
		System.out.println("iv = " + iv);
		System.out.println("this.iv = " + this.iv);
		System.out.println("I 내부 클래스의 test 메소드");
		}
}