package ch14_Lambda;

public class Lam_Ex4 {
	public static void main(String[] args) {
		/*
		 * 매개변수와 리턴값이 있는 경우
		 * 람다식 내부에 실행되는 구문이 한개 일 때 {}, return 생략 가능 
		 * */
		LambdaInterface4 f4 = (x, y) -> {
			return x * y;
		};
		System.out.println("두수의 곱 : " + f4.method(2, 5));
		f4 = (x, y) -> x + y;
		System.out.println("두수의 합 : " + f4.method(2, 5));
		f4 = (x, y) -> x / y;
		System.out.println("두수의 몫 : " + f4.method(5, 2));
		f4 = (x, y) -> x % y;
		System.out.println("두수의 나머지 : " + f4.method(5, 2));
		f4 = (x, y) -> (x > y)? x : y;
		System.out.println("두수 중 큰수 : " + f4.method(2, 5));
		f4 = (x, y) -> (x < y)? x : y;
		System.out.println("두수 중 작은 수 : " + f4.method(2, 5));
		f4 = (x, y) -> sum(x, y);
		System.out.println("두수의 합 : " + f4.method(2, 5));
		execute((x, y) -> sum(x, y), 33, 11); 
	}
	
	static int sum(int x, int y) {
		return x + y;
	}
	static void execute(LambdaInterface4 f4, int x, int y) {
		System.out.println(f4.method(x, y));
	}
}

interface LambdaInterface4 {
	int method(int x, int y);
}