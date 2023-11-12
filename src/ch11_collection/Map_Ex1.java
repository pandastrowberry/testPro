package ch11_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key는 중복 허용x
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		
		//Value = map.get(Key) : Key에 해당하는 Value 값 리턴
		System.out.println("홍길동의 번호 : " + map.get("홍길동"));
		System.out.println("이몽룡의 번호 : " + map.get("이몽룡"));
		System.out.println("김삿갓의 번호 : " + map.get("김삿갓"));
		
		//Key만 조회
		System.out.println("Key들만 조회");
		Set<String> keys = map.keySet(); //key만 모아서 set
		for (String k : keys) {
			System.out.println(k + "의 번호 : " + map.get(k));
		}
		
		//Value만 조회
		System.out.println("Value들만 조회");
		Collection<Integer> values = map.values(); //Key값 조회x
		//Set<Integer> values = map.values(); //에러 -> 원래 Collection이기 때문에 casting을 하면 안됨
		
		//values -> Collection
		for (Integer v : values) {
			System.out.println(v);
		}
		
		//Key, Value의 쌓인 객체로 조회
		System.out.println("Key, Value의 쌍인 객체로 조합");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		//Map.entryset -> Set
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "의 번호 : " + m.getValue());
			System.out.println(m);
		}
	}

}
