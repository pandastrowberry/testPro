package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List_Ex4 {
	public static void main(String[] args) {
		List<Person>li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		print(li);
		System.out.println(li.indexOf(new Person("홍길동", 10))); //-1, equals 오버라이딩 해서 동등 객체 찾아야 (Object는 주소로 비교하기 때문에)
		System.out.println(li.indexOf(p1));
		
	}
	
	public static void print(List li) {
		for (Object ob : li) {
			System.out.println(ob);
		}
	}
}

