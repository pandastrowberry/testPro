package ch14_Lambda;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Lam_Ex7 {
	public static void main(String[] args) {
		/*
		 * Supplier 인터페이스 예제
		 * 매개변수는 없고, 리턴 값은 존재
		 * */
		Supplier<String> s1 = () -> {
			return "java";
		};
		System.out.println(s1.get());
		Supplier<String> s2 = () -> "java2";
		System.out.println(s2.get());
		
		IntSupplier s3 = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		System.out.println("주사위 : " + s3.getAsInt());
		IntSupplier s4 = () -> 
			(int)(Math.random() * 6) + 1;
		System.out.println("주사위 : " + s4.getAsInt());	
		
		DoubleSupplier s5 = () -> {
			
		}
	}
}
