package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iterator_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Iterator : 반복자
		 * it.hasNext() : 다음에 입력된 주소. 있으면 true
		 * it.next() : 다음 주소 return
		 * */
		List<String> list = new ArrayList<String>(); 
		list.add("1");
		list.add("2");
		list.add("13");
		list.add("42");
		list.add("5");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
