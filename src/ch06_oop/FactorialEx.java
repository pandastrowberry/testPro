package ch06_oop;

public class FactorialEx {
	static String grade2;
	public static void main(String[] args) {
		/*call stack 영역
		 * 재귀메소드(함수) : 자신이 자신메소드를 다시 호출하는 메소드 => 스택 영역이 존재하기 떄문에 가능 
		 */
		System.out.println("4! = " + factorial(4));
	}
	
	public static int factorial (int i) {
		System.out.println(" i" + i);
		return (i == 1)? 1 : i * factorial(i -1); 
	}
	
}
