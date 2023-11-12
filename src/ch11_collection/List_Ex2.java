package ch11_collection;

import java.util.Vector;

public class List_Ex2 {
	public static void main(String[] args) {
		/*
		 * Vector : Collection 프레임워크 이전에 사용된 클래스(List의 구현 클래스)
		 * 			list.addElement(5.0); -> Vector의 추가기능 메소드(=add)
		 */
		
		Vector<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0);
		list.add(5.0);
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("1 : " + list );
		double num = 5.0;
		int index = list.indexOf(num);
		if(index >= 0) {
			System.out.println(num + "의 위치 : " + index);
		}
		else {
			System.out.println(num + "은 list에 없습니다.");	
			
			}
		num = 0.3;
		System.out.println(list.indexOf(num));
		System.out.println(list.indexOf(5.0));
		if (list.contains(num)){
			list.remove(num);
			System.out.println(num + "삭제됨");
		}
		System.out.println("2 : " + list);
		System.out.println(list.indexOf(num));
		System.out.println(list.indexOf(5.0));
		System.out.println(list);
	}
}
