package ch14_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lam_Ex10 {
	private static List<Student2> list = Arrays.asList(new Student2("홍길동", "남자", 90), new Student2("김순희", "여자", 90), new Student2("김자바", "남자", 95), new Student2("박한나", "여자", 92));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수 : " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수 : " + femaleAvg);
	}
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		
		for (Student2 student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum /count;
	}

}

class Student2 {
    private String name;
    private String sex;
    private int score;
    
    public Student2(String name, String sex, int score) {
       this.name = name;
       this.sex = sex;
       this.score = score;
    }

    public String getSex() { return sex; }
    public int getScore() { return score; }
    }