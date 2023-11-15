package ch14_Lambda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class Lam_Ex9 {
	private static Student[] list = {new Student("홍길동", 90, 80, "경영"), new Student("김삿갓", 95, 70, "컴공"), new Student("이몽룡", 100, 70, "수학")};
	
	
	public static void main(String[] args) {
		/*
		 * Operator 인터페이스 예제 : apply 계열 추상 메소드 소유
		 * 단, 매개변수의 자료형과 리턴값의 자료형이 같다.
		 * Function 인터페이스의 하위 인터페이스
		 * result = op.applyAsInt(result, next);
		 * */
		System.out.println("최대 수학 값 : ");
		int max = maxOrMinMath((a, b) -> (a >= b)? a : b);
		max = maxOrMinMath((a, b) -> {
			if (a >= b)
				return a;
			else 
				return b;
			}
		);
		max = maxOrMinMath((a, b) -> {
			return ((a >= b)? a : b);
		}
		);
		System.out.println(max);
		System.out.println("최소 수학 값 : ");
		System.out.println(maxOrMinMath((a, b) -> (a <= b)? a : b));
		System.out.println("최대 평균 값 : ");
		System.out.println(maxOrMinMath(a, b));
		System.out.println("최소 평균 값 : ");
	}
	static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for (Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
	static double maxOrMinMathAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2;
		for (Student s : list) {
			result = op.applyAsDouble(result, s.getMath() + s.getEng()/(double)2);
		}
		return result;
	}
}
