package ch14_Stream;

import java.util.Arrays;
import java.util.List;

public class Stream_Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("홍길동", Member.MALE, 30), new Member("김나리", Member.FEMALE, 20), new Member("신용권", Member.MALE, 45), new Member("박수미", Member.FEMALE, 27));
		double ageAvg = list.stream().filter(m -> m.getGender() == Member.MALE).mapToInt(s -> s.getAge()).average().getAsDouble();
		System.out.println("남자 평균 나이 : " + ageAvg);
	}
}
class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int gender, age;
	public Member(String name, int gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}