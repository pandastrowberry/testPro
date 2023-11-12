package ch07_oop;

public class SuperEx1 {

	public static void main(String[] args) {
		/*
		 * super() 생성자 : 부모 클래스의 생성자 호출시 사용
		 */
		Child c = new Child();
		System.out.println(c.x);
	}
}

class Super {
	int x;
	//default 생성자x
	Super(int x) {
		this.x = x;
	}
}

class Child extends Super {
	int y;
	public Child (){
		super(10);
	}
}