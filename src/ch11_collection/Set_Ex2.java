package ch11_collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 객체의 중복을 논리적 판단하는 기준(동등객체)
		 *  1. equals(Object) : 결과가 true
		 *  2. hashCode() : 결과가 동일
		 *  두개의 메서드가 Object의 멤버 메서드임
		 *  => equals 메서드를 오버라이딩   
		 *  => hashCode() 메서드도 오버라이딩 
		 *  => toString() 메서드 오버라이딩 
		 *  
		 *  String equals(), hashCode() 오버라이딩
		 */
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 10));
		set.add(new Person("이정민", 10));
		set.add(new Person("김윤민", 16));
		print(set);
		System.out.println("===========");
		Person p1 = new Person("김삿갓", 20);
		Person p2 = new Person("김삿갓", 20);
		p2 = p1;
		set.add(p1);
		set.add(p2);
		print(set);
	}

public static void print(Set li) {
	for (Object ob : li) {
		System.out.println(ob);
		}
	}
}