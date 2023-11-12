package ch08_exp;

public class ExceptionEx4 {
	
	public static void main(String[] args) {
		/*
		 * throws : 예외 처리 : 발생된 예외를 상위 메소드에 전달
		 * throw : new 예외 발생 : 예외 강제 발생
		 * 
		 */
		try {
			throw new Exception("예외 강제 발생 =============");
		} 
		catch (Exception e) {
			//e.printStackTrace();
		}
		
	}
}
