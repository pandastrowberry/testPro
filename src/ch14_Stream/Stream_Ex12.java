package ch14_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_Ex12 {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(new Student2("홍길동", 1, 89, 56, 66), new Student2("김삿갓", 1, 85, 56, 80), new Student2("이몽룡", 2, 90, 78, 95), new Student2("임꺽정", 3, 60, 56, 88));
		list.stream().sorted().forEach(System.out :: println);
		System.out.println("영어 점수 역순으로 정렬하여 출력 : 랃다 식");
		list.stream().sorted(new Comparator<T>(Student2) () {
			public int compare(Student2 o1, Student o2) {
				return o2.getEng() - o1.getEng();
		}	
}
				).forEach(System.out :: println);
		System.out.println("수학 점수 역순으로 정렬해서 출력 : 람다식" );
		list.stream().sorted((s1, s2) -> s2. 
	}
}
class Student2 implements Comparable<Student2>{
	String name;
	int ban, eng, math, kor, score;
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student2 s = (Student2) obj;
		return name.equals(s.name);
	}
	public Student2(String name, int ban, int eng, int math, int kor) {
		super();
		this.name = name;
		this.ban = ban;
		this.eng = eng;
		this.math = math;
		this.kor = kor;
		this.score = eng + math + kor;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", eng=" + eng + ", math=" + math + ", kor=" + kor
				+ ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		//a.compareTo()
		//
		return score - o.score;
	}
}