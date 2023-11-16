package ch14_Stream;

import java.util.Arrays;
import java.util.List;

public class Stream_Ex9 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바 8 버전에", "추가된 스트림을", "열심히 공부하자");
		list1.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(word -> System.out.println(word));
		
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50 ,60");
		IntStream isr = list2.stream().flatMapToInt(data -> {String[] strArr = data.split(","); int[] Arr = new int[str.Arr.length];
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i].trim());
			return Arrays.stream(intArr);
		}
		System.out.println(isr.sum());
		}
		);
	}
}

