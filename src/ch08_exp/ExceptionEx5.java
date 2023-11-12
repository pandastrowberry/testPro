package ch08_exp;

public class ExceptionEx5 {
	
	public static void main(String[] args) {
		/*
		 * throws 예외 처리
		 * throws Exception을 처리한 메소드는 호출한 메소드에서 처리
		 * 단, RuntimeException은 처리 안해도 됨
		 * 
		 */
		
		try {
			first(); //1
		}
		
		catch (Exception e) {
			//Auto-generated catch block
			//e.printStackTrace(); 
		}
		System.out.println("first");
	}
	
	private static void first() throws Exception{
		second();
		System.out.println("first");
	}
	
	private static void second() throws Exception{
		System.out.println("second 메소드");
		//NumberFormatException 예외 발생
		System.out.println(Integer.parseInt("abc"));
	}
}


