package ch09_lang;

public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자형 문자열을 숫자로 변경
		 * parseXXX() 
		 */
		
		int is = Integer.parseInt("123");
		System.out.println(is);
		is = Integer.parseInt("123",8); //123을 8진수로 인식해서 10진수로 수행
		System.out.println(is);
		is = Integer.parseInt("123",16); //123을 16진수로 인식해서 10진수로 수행
		System.out.println(is);
		
		float f = Float.parseFloat("123.45");
		System.out.println(f);
		f = Float.parseFloat("123.45f");
		System.out.println(f);
		
		double d = Double.parseDouble("123.45");
		System.out.println(d);
		
		System.out.println(Integer.toBinaryString(500));
		System.out.println(Integer.toOctalString(500));
		System.out.println(Integer.toHexString(500));
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
	}
}