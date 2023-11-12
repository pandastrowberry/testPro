package ch07_interface;
	/*
	 * final 제어자 : 변경 불가
	 * final 클래스 : 상속 불가 클래스
	 *              다른 클래스의 부모 클래스 불가
	 *              String 클래스가 final 클래스
	 * */
public final class FinalClass {

}

class SubClass extends FinalClass {
	
}

class Sub2 extends String {
	
}