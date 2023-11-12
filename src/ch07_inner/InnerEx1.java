package ch07_inner;

public class InnerEx1 {
	public static void main(String[] args) {
		/*
		 * 내부 클래스 
		 * 
		 *  인스턴스 내부클래스 : 
		 *  static 내부클래스 :
		 *  지역내부클래스        : 메서드 내에 선언된 클래스. 메서드 내부에서만 사용이 가능함.
		 *  이름없는(무명의)내부클래스 : 클래스 없이 객체화 가능한 클래스
		 *                        추상클래스,인터페이스 의 객체화 가능함.    
		 */
		

		Outer1.StaticInner s1 = new Outer1.StaticInner();
		System.out.println(s1.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(s1.cv);
		System.out.println(Outer1.StaticInner.MAX);
		
		Outer1.InstanceInner i1 = (new Outer1()).new InstanceInner();
		Outer1 outer = new Outer1();
		Outer1.InstanceInner il2 = outer.new InstanceInner();
		System.out.println(il2.iv);
		System.out.println("Outer1.InstanceInner.cv : " + Outer1.InstanceInner.cv);
		System.out.println(Outer1.InstanceInner.MAX);
		outer.method();
	}
}

class Outer1 {
	class InstanceInner {
		int iv = 100;
		static int cv = 700;
		final static int MAX = 200;
	}
	
	static class StaticInner {
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	
	void method() {
		class LocalInner {
			int iv = 600;
			static int cv = 700;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(lc.MAX);
		System.out.println(LocalInner.MAX);
		System.out.println(LocalInner.cv);
	}
	void method2() {
		
	}
}