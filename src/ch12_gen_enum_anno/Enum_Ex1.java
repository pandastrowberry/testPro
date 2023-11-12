package ch12_gen_enum_anno;

enum Direction1{EAST, SOUTH, WEST, NORTH}

/*
 * String name() : 열거형 상수의 이름을 문자열로 리턴
 * int ordinal() : 열거형 상수가 정의된 순서 리턴(0부터 시작)
 * valueOf(String name) : (지정된 열거형에서) name과 일치하는 열거형 상수 리턴
 * values() : 열거형 상수들을 배열 형태로 리턴
 * 
 * 
 * */


public class Enum_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction1 d1 = Direction1.EAST;
		Direction1 d2 = Direction1.valueOf("WEST"); //객체 선택
		Direction1 d3 = Enum.valueOf(Direction1.class, "EAST");
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d1 == d2? " + (d1 == d2));
		System.out.println("d1 == d3? " + (d1 == d3));
		System.out.println("d1.equals(d3)? " + d1.equals(d3)); //객체 동등 정의 메소드
		//System.out.println("d2 > d3?" + (d2 > d3)); //기본형 타입만 부등호 가능
		System.out.println("d1.compareTo(d3)? " + d1.compareTo(d3)); //순서 번호를 비교해서 계산(1번지부터 시작) 
		System.out.println("d1.compareTo(d2)? " + d1.compareTo(d2));
		
		switch(d1) {
		case EAST : 
			System.out.println("The direction is EAST."); break;
		case SOUTH : 
			System.out.println("The direction is SOUTH."); break;
		case WEST : 
			System.out.println("The direction is WEST."); break;
		case NORTH : 
			System.out.println("The direction is NORTH."); break;
		}
		Direction1[] dArr = Direction1.values();
		for (Direction1 d : dArr) {
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
		}
	}
}

