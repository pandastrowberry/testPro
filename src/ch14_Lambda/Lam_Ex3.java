package ch14_Lambda;

public class Lam_Ex3 {
	public static void main(String[] args) {
		/*
		 * 매개변수 존재, 리턴값이 없을 때
		 * 매개변수가 한 개 일때 {} 생략 가능
		 * 실행되는 구문이 한 개 일때 {} 생략 가능
		 * */
		LambdaInterface3 f3;
		f3 = (x) -> {
			System.out.println(x * 5);
		};
		f3.method(2);
		f3.method(10);
		f3 = (x) -> {
			System.out.println(x + x);
		};
		f3.method(10);
		f3 = x -> System.out.println(x * 3);
		f3.method(10);
		
		LambdaInterface3 f4 = new LambdaInterface3() {
			@Override
			public void method(int x) {
				print(x);
			}
 		};
 		f4.method(10);
 		excute(x -> print(x), 3);
	}
	static void print(int x) {
		System.out.println(x + 3);
	}
	static void excute(LambdaInterface3 f3,int num) {
		f3.method(num);
	}
	
}

interface LambdaInterface3 {
	void method(int x);
}

