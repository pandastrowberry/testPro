package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/* Collections class  
 * sort(List) : 사용자정의 클래스는 반드시 Comparable 인터페이스를 구현한 클래스만 가능함
 * sort(List, Comparator) : Comparable 인터페이스를 구현하지 않은 클래스도 가능함
 
 */
public class List_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		print(li);
		System.out.println("==================Comparable");
		Collections.sort(li);
		print(li);
		System.out.println("==================CompPerson");
		Collections.sort(li, new CompPerson());
	
		print(li );
		System.out.println("==================Comparator");
		Collections.sort(li, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				//TODO Auto-generated method stub
				
				return o1.name.compareTo(o2.name);
			}
		}
	 );
		print(li );
	}

	public static void print(List li) {
		for (Object ob : li) {
			System.out.println(ob);
		}
	}
}

class CompPerson implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		//TODO Auto-generated method stub
		return (o1.age-o2.age);
	//return o1.name.compareTo(o2.name);
	}
	
}