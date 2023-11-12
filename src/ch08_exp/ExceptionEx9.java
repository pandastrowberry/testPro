package ch08_exp;

//Try-with-resources
public class ExceptionEx9 {
	   public static void main(String[] args) {
		  
		   try (AutoCloseableUse cr = new AutoCloseableUse()) {
			   System.out.println("process");
		   }
		   System.out.println();
	   }
}	 
class AutoCloseableUse implements AutoCloseable {
	public void close() {
		System.out.println("close()가 호출됨 ===");
	}
}
