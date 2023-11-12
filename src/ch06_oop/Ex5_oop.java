package ch06_oop;

public class Ex5_oop {
	public static void main(String[] args) {
		/*
		 * main 메소드에서 Animal 클래스의 객체 생성이 되도록 생성자 구현
		 * name : 동물 이름
		 * age : 나이
		 * 
		 * 
		 * (결과)
		 * 1) new Animal("원숭이", 26)
		 * toString() 구현
		 * */
		
		Animal a = new Animal("원숭이", 26);
		System.out.println(a);
	}
}

class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age ;
	}
	
}