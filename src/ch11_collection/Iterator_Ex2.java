package ch11_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iterator_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashMap을 Iterator로 수정해서 출력
		 * Collection : co.iterator();
		 * Set : set.iterator()
		 * List : li.iterator() 
		 * Map -> Iterator;
		 * Map -> Set : keyset() -> iterator()
		 * Map -> Set : entryset() -> iterator()
		 * Map -> Collection : values() -> iterator()
		 */
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		//객체 저장
		map.put("나자바", 85);
		map.put("홍길동", 90);
		map.put("홍장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 : " + map.size());
		
		//객체 생성
		System.out.println("\t홍길동 : " + map.get("홍길동") );
		System.out.println();
		
		//Map.keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("map.keySet()");
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		System.out.println("map.entrySet()");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
		while (entryIt.hasNext()) {
			Entry<String, Integer> en = entryIt.next();
			System.out.println("\t" + en.getKey() + " : " + en.getValue());
		}
		System.out.println();
		
		System.out.println("map.values()");
		Collection<Integer> c = map.values();
		Iterator<Integer> valueIterator = c.iterator();
		while (valueIterator.hasNext()) {
			Integer value = valueIterator.next();
			System.out.println(value);
		}
		System.out.println();
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}
