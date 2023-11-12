package ch08_exp;

public class ExceptionEx3 {
	
	public static void main(String[] args) {
		/*
		 * finally 구문 : 정상 실행/ 예외 실행 모두 실행
		 * 				try, catch 구문에서 return문을 만나도 finally 실행
		 * 				try 구문과 같이 사용
		 */
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3/0);
			//return; //메소드 종료
		} 
		catch (Exception e) {
			System.out.println(4);
			return;
		}
		finally {
			System.out.println("finally : " + 5);
		}
		System.out.println(6);
	}
}
