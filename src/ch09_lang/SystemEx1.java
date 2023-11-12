package ch09_lang;

public class SystemEx1 {
		
	public static void main(String[] args) {
			System.out.println("System의 프로퍼티 값 조회");
			
			System.getProperty("java.version");
			System.getProperty("java.home");
			System.getProperty("os.home");
			System.getProperty("file.separator");
			System.getProperty("user.name");
			System.getProperty("user.home");
			System.getProperty("user.dir");
			
			System.out.println("============");
			System.out.println("\n환경변수 값 조회");
			for (String env : System.getenv().keySet()) {
				System.out.println(env + " = " + System.getenv(env));
			}
	}
}

