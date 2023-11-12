package ch11_collection;

import java.util.Comparator;

import java.util.TreeSet;

public class Set_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정렬 메소드
		 * Comparable 메소드 : 추상메소드 compareTo(Object)
		 * 					클래스의 기본 정렬 방식 지정 
		 * Comparator : 추상메소드 compare(Object o1, Object o2)
		 * 				기본정렬 방식대로 하지 않고, 사용자가 임의로 정렬 방식 지정
		 * */
		System.out.println("나이순으로 출력");
		TreeSet<Person> set = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age;
			}
		}
	);
		set.add(new Person("홍길동", 33));
		set.add(new Person("김삿갓", 22));
		set.add(new Person("이몽룡", 55));
		System.out.println(set);
		
		System.out.println("=================");
		
		System.out.println("이름순으로 출력");
		set = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.name.compareTo(p2.name);
			}
		}
	);
	set.add(new Person("홍길동", 33));
	set.add(new Person("김삿갓", 22));
	set.add(new Person("이몽룡", 55));
	System.out.println(set);
	
	System.out.println("=================");
	
	System.out.println("Comparable을 사용한 출력");
	set = new TreeSet<Person>();
	set.add(new Person("홍길동", 33));
	set.add(new Person("김삿갓", 22));
	set.add(new Person("이몽룡", 55));
	System.out.println(set);
	
	}
}