package ch14_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream_Ex7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전", "춘향전", "구운몽", "전우치편", "사씨남정기");
		System.out.println();
		IntStream isr  = list.stream().mapToInt(String :: length);
		isr.forEach(System.out :: println);
		
		System.out.println();
		
		list.stream().mapToInt(s -> s.length()).forEach(s -> System.out.println(s));
	}
}
