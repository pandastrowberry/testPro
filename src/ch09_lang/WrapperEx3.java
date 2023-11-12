package ch09_lang;

public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Character 클래스
		 */
		
		char[] data = {'A', 'a', '4', '&'};
		for (char c : data) {
			if (Character.isUpperCase(c)) {
				System.out.println(c + " : 대문자임");
			}
			else if(Character.isLowerCase(c)) {
				System.out.println(c + " : 소문자임");
			}
			else if(Character.isDigit(c)) {
				System.out.println(c + " : 숫자임");
			}
			else {
				System.out.println(c + " : 일반문자임");
			}
		}
		Character ch = 'A';
		System.out.println(ch.equals('A'));
		System.out.println(ch == 'A');
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('가'));
		System.out.println(Character.isAlphabetic(1));
	}
}