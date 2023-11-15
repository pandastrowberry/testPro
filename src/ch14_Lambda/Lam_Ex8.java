package ch14_Lambda;

import java.util.function.Function;

public class Lam_Ex8 {
	/*
		 * Function 계열 함수 인터페이스 : applyXXX 추상메소드를 멤버로 가짐
		 * 매개변수와 리턴 값 존재
		 * 주로 매개 값을 리턴 값으로 매핑(타입 변환) 할 경우 사용
		 * Functional<Parameter(매개변수), Return(리턴타입)> 
		 * */
		
		private static Student[] list = {new Student ("홍길동", 90, 80, "경영"), new Student("김삿갓", 95, 70, "컴공")};
		public static void main(String[] args) {
			System.out.print("학생의 이름 : ");
			printString(t -> t.getName());
			System.out.print("전공 이름 : ");
			printString(t -> t.getMajor());
			System.out.println("============");
			Function<Student, String> f2 = t -> t.getName();
			printString(f2);
			printString(new Function<Student, String>() {
				
				@Override
				public String apply(Student t) {
					// TODO Auto-generated method stub
					return t.getName();
				}
			});
			
			System.out.println("영어 점수 : ");
			printInt(s -> s.getEng());
			System.out.println("수학 점수 : ");
			printInt(s -> s.getMath());
			
			System.out.println("영어 점수 합계 : ");
			System.out.println("수학 점수 합계 : ");
			System.out.println("영어 점수 평균 : ");
			System.out.println("수학 점수 평균 : ");
		}
		private static void printString(Function<Student, String > f) {
			for (Student s : list) {
				System.out.println(f.apply(s) + ", ");
			}
		}
		private static void printInt(Function<Student, Integer > f) {
			for (Student s : list) {
				System.out.println(f.apply(s) + ", ");
			}
			System.out.println();
		}
		private static void PrintAvg(Function<Student,Integer> f) {
			int sum = 0;
			for (Student s : list) {
				sum += f.apply(s);
			}
			System.out.println();
		}
		private static void printTot(Function<Student, Integer> f) {
			int sum = 0;
			for (Student s : list) {
				sum += f.apply(s);
			}
			System.out.println(sum);
		}
}
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
	  Student() {
	   }

	   public Student(String name, int eng, int math, String major) {
	      this.name = name;
	      this.eng = eng;
	      this.math = math;
	      this.major = major;
	   }

	   // getter
	   public String getName() {
	      return name;
	   }

	   public int getEng() {
	      return eng;
	   }

	   public int getMath() {
	      return math;
	   }

	   public String getMajor() {
	      return major;
	   }

}