package ch14_Lambda;

public class Lam_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.method();
	}

}
interface LambdaInterface5 {
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		int iv = 40;
		LambdaInterface5 f5 = () -> {
			//int iv = 50;
			System.out.println("Outer.this.iv = " + Outer.this.iv);
			System.out.println("this.iv = " + this.iv);
			System.out.println("iv = " + iv);
		};
		f5.method();
	}
}