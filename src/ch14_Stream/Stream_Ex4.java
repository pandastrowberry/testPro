package ch14_Stream;

import java.util.stream.Stream;

public class Stream_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> strArrStrm = Stream.of("abc", "def", "jkl", "ABC", "DEF", "JKL");
		strArrStrm.filter(s -> s.compareTo("a") > 0).forEach(s -> System.out.println(s));
	}
}

