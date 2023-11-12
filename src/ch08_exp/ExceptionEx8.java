package ch08_exp;

import java.io.IOException;

public class ExceptionEx8 {
	   public static void main(String[] args) {
		  /*
		   * 
		   * 오버라이딩된 메소드의 예외처리는 부모메소드의 예외처리와 같거나 자손 Exception만 가능(상속간 오버라이딩)
		   * 또한 관련없는 예외처리x
		   * 
		   * */
	   }
}	 
		  
class Parent {
	void method(int i) throws IOException{
		System.out.println(i);
	}
}

class Child extends Parent {
	@Override
	void method(int i) throws Exception { //자손 클래스로 바꿔야
		System.out.println(i);
		try {
			throw new IOException();
		}
		catch (IOException e) {
			
		}
	}
}