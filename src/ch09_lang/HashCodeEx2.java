package ch09_lang;

import com.sun.jdi.Value;

public class HashCodeEx2 {
		
	public static void main(String[] args) {
		String s1 = new String("str");
		String s2 = new String("str");
		
		System.out.println(s1.equals((s2)));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("s1 객체 진짜 해쉬 값 : " + System.identityHashCode(s1));
		System.out.println("s1 객체 진짜 해쉬 값 : " + System.identityHashCode(s2));
	}
}

