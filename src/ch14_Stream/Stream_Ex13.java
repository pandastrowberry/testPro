package ch14_Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream_Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Student2> studentStream = Stream.of(
	              new Student2("김길동",1,89,56,66),
	            new Student2("김삿갓",1,85,88,80),
	            new Student2("김삿갓",1,80,88,80),
	            new Student2("김삿갓",1,90,88,80),
	            new Student2("이몽룡",2,90,78,95),
	            new Student2("임꺽정",3,60,56,88),
	            new Student2("임꺽정",1,90,72,72)
	               );
		studentStream.sorted(Comparator.comparing(Student2 :: getBan).thenComparing(Student2 :: getName).thenComparing(s -> s.getEng())).forEach(System.out :: println);
	}

}
