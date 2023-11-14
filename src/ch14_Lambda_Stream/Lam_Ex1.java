package ch14_Lambda_Stream;

public class Lam_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * 
		 * */
		LambdaInterface1 f1 = new LambdaInterface1() {
			public void method() {
				System.out.println("1) 기존방식으로 코딩");
			}
		};
		f1.method();
		f1 = () -> {
			String str = "2) method call2";
			System.out.println(str);
		};
		f1.method();
		f1 = () -> System.out.println("3) method call3");
		f1.method();
		execute(() -> { 
			String str = "4) method call4"; 
			System.out.println(str);}
		);
		f1.method();
		execute(() -> System.out.println("5) method call5"));
	static void execute(LambdaInterface1 f1) {
		f1.method();
	}
}
@FunctionalInterface
interface LambdaInterface1 {
	void method();
}