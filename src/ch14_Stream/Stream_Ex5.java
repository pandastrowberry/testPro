package ch14_Stream;

import java.util.Arrays;
import java.util.List;

public class Stream_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*메소드 참조
		 *람다식                              메소드 참조
		 *static 메소드 : a -> 클래스명.메소드(a)   쿨래스 명 :: 메소드 명
		 *인스턴스 메소드 : (a, b) -> a.메소드(b)   클래스 명 :: 메소드 명
		 *            (a) -> 객체.메소드(a)     클래스명 :: 메소드 명
		 *생성자(a) : new 생성자(a)              생성자 명 :: new
		 *배열 생성자 (a) : new 타입(a)           타입 :: new 
		 */
		List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "임꺽정", "홍길동");
		list.stream().forEach(n -> System.out.println(n));
		System.out.println();
		
		list.stream().distinct().forEach(System.out :: println);
		System.out.println();
		
		list.stream().filter(n -> n.startsWith("홍")).forEach(System.out :: println);
		System.out.println();
		
		list.stream().filter(n -> n.startsWith("홍")).distinct().forEach(n -> System.out.println(n));
		System.out.println();
	}
}
