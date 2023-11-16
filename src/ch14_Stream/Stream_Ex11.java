package ch14_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_Ex11 {
	public static void main(String[] args) {
		/*
		 * Stream 정렬
		 * Comparable을 기본으로 상속 받은 객체
		 * 
		 * sorted = sql에서 order by
		 * */
		List<String> list = Arrays.asList("홍길동", "김삿갓", "이몽룡", "임꺽정");
		list.stream().forEach(System.out :: println);
		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out :: println);
		System.out.println();
		
		System.out.println("기본을 역순으로 정렬");
		list.stream().sorted()(Comparator.reverseOrder()).forEach(System.out :: println);
		}
}
