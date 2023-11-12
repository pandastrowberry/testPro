package ch07_oop;

public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 추상클래스끼리 상속 가능
		 * 추상클래스가 자손 클래스인 경우 부모의 추상 메소드를 구현하지 않아도 됨
		 * 단, 추상 클래스를 상속받은 일반 클래스는 모든 추상 메소드를 구현
		 */
		
		Abs1 a1 = new Normal();
		System.out.println(a1.getA());
		//System.out.println(al.getB()) 
		Abs2 a2 = (Abs2)a1;
		System.out.println(a2.getA());
		System.out.println(a2.getB());
		Normal n = (Normal)a2;
		System.out.println(n.getA());
		System.out.println(n.getB());
		//a2 = new Abs2(); 추상클래스는 객체화 안되기 때문에 에러
		}
}

abstract class Abs1 {
	int a = 10; 
	protected abstract int getA(); 
}

abstract class Abs2 extends Abs1{
	int b = 20; 
	protected abstract int getB();
}

class Normal extends Abs2 {
	@Override
	protected int getB() {
		return b;
	}
	@Override
	public int getA() {
			return a;
	}
}
