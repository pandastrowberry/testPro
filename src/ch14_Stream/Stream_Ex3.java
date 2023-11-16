package ch14_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Ex3 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
	            new Student("홍길동", 90),
	            new Student("신용권", 92),
	            new Student("나자바", 70),
	            new Student("김몰라", 65),
	            new Student("이몽룡", 87)
	      );
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
		list.stream().forEach(s -> System.out.println(s));
		list.stream().forEach(s -> {String name = s.getName(); int score = s.getScore(); System.out.println(name + "-" + score);
		
	});
		double avg = list.stream().//mapToInt(s -> s.getScore()).average().getAsDouble();
								  mapToInt(Student :: getScore).average().getAsDouble();	
		System.out.println("평균 : " + avg);
		
		System.out.println("parallelStream");
		list.parallelStream().forEach(s -> print(s));
	}
	public static void print(Student str) {
		System.out.println(str + Thread.currentThread().getName());
	}
}
class Student {
	private String name;
	private int score;
	public Student (String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}