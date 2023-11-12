package ch07_oop;
import temp.Modifier2;

public class ModifierEx1 {

	public static void main(String[] args) {
		/*
		 * 접근 제한자
		 * private < (default) < protected < public 
		 * 	class     package       상속        모두
		 */
		
		
		Modifier m1 = new Modifier();
		//System.out.println(m1.v1); 접근 불가
		System.out.println(m1.v2);
		System.out.println(m1.v3); //protected same package
		m1.method();
		Modifier3 m3 = new Modifier3();
		//System.out.println("m3.v1 = " + m3.v1);
		//System.out.println("m3.v2 = " + m3.v2);
		//System.out.println("m3.v3 = " + m3.v3);
		System.out.println("m3.v4 = " + m3.v4);
		//Math m = new Math(); Math는 생성자의 접근 제어자가 private, 객체 생성x
	}
}

class Modifier {
	private int v1 = 100;
	int v2 = 200;
	protected int v3 = v1; 

	public void method() {
		System.out.println("ch07_oop,Modifier.method() 메소드임");
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
	}	
}

class Modifier3 extends Modifier2 {
	public void method () {
		//System.out.println("v1 = " + v1); 변수의 접근제어자가 private
		//System.out.println("v2 = " + v2); 변수의 접근제어자가 default
		System.out.println("v3 = " + v3); //v3 변수의 접근제어자가 protected
		System.out.println("v4 = " + v4); //모든 접근 허용
	}
}