package ch07_inner;

public class InnerEx2 {
	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.method(1111);
	}
}

class Outer2 {
	int i = 0;
	private static int outercv = 20;
	private int outeriv = 10;
	
	void method(int pv) {
		//지역 내부클래스에서 사용되는 메소드의 지역변수는 상수화(final) 되어야 한다
		
		//pv ++;
		i ++; //final x
		outeriv ++;
		
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
				//지역내부클래스에서 내부클래스가 속한 메소드의 지역변수 변경x
				//int i = 100;
				//i ++;
				//int pv = 0;
				//pv ++;
				System.out.println("i = " + i);
				System.out.println("pv = " + pv);
				System.out.println(liv + "," + liv2);
				System.out.println(outeriv + "," + outercv);
				//외부클래스의 private 멤버 접근 가능
			}
		}

		LocalInner li = new LocalInner();
		li.method();
	}
}
