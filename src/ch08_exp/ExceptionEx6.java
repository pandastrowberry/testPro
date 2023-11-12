package ch08_exp;

public class ExceptionEx6 {
	
	public static void main(String[] args) {
	
		try {
			badmethod(); //1
		}
		
		catch (Exception e) {
			System.out.println("main에서 예외 처리"); //7
			e.printStackTrace(); //8
		}
	}
	
	private static void badmethod() throws Exception{ //6
		try {
			throw new Exception ("예외 강제 발생"); //2
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("badmethod에서 예외 처리"); //3
			e.printStackTrace(); //4
			throw e; //5 (예외 재발생)
		} 
	}
}


