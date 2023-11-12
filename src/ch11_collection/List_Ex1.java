package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Ex1 {
	public static void main(String[] args) {
		/*
		 * <Integer> : 제네릭 표현 
		 * List<Integer> : Integer 객체를 리스트에 저장
		 * ArrayList : 가변배열(저장할 개수를 몰라도 객체 저장 가능하고, 첨자 사용 가능) 
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(0);
		System.out.println(list);
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println(sum);
		//list.subList(1, 4) : list 객체의 1번 인덱스부터 3번 인덱스까지 부분리스트로 반환
		List list2 = new ArrayList(list.subList(1, 4));
		//list2 정렬
		//Collections : Collection 프레임워크에 관련된 추가 기능을 멤버로 가진 클래스
		Collections.sort(list2); //list2 List객체 정렬
		System.out.println(list2);
	}
}
