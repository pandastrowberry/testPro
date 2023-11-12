package ch09_lang;

public class StringEx2 {
		
	public static void main(String[] args) {
		/*
		 * String은 값의 대입에 따라 주소 설정
		 * str의 주소가 값의 입력에 따라 바뀜
		 */
		String str = "ABC";
		String str1 = "ABC";
		System.out.println("1)str hashCode() : " + System.identityHashCode(str) + " , " + System.identityHashCode(str1));
		System.out.println("main " + str);
		change(str);
		System.out.println("2) str hashCode() : " + System.identityHashCode(str) + " , " + System.identityHashCode(str1));
		System.out.println("change 이후 main 재설정 안함 : " + str);
		str = change(str);
		System.out.println("3) str 주소 재설정 hashCode() : " + System.identityHashCode(str) + " , " + System.identityHashCode(str1));
		System.out.println("change 이후 main - 재설정 : " + str);
		
	}

static String change(String str) {
		str += "456";
		System.out.println("change() s : " + str + " : " + System.identityHashCode(str));
		return str;
	}
}