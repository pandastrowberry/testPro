package ch07_oop;

public class SingletonEx {

	public static void main(String[] args) {
		/*
		 * 상속
		 * 1. 내 안에 부모(parent) 있다
		 * 2. 상속 간에는 주소 공유 가능(casting)
		 * 		child = (Child) parent (명시적 Casting) 
		 * 		parent = child
		 * 3. child 생성자는 항상 parent 생성자 먼저 구현
		 * 	  super 생성자 생략하면 super에 default 생성자 실행
		 * 4. 변수는 재정의 x
		 * 5. 메소드는 재정의
		 */
			//SingleObject so = new SingleObject(); 생성자 접근x, 객체 생성x
			SingleObject so1 = SingleObject.getObject();
			SingleObject so2 = SingleObject.getObject();
			
			System.out.println(so1 + "," + so2); //주소 같음
			System.out.println(so1 == so2);
			Object o1 = new Object();
			Object o2 = new Object();
			System.out.println(o1 + "," + o2);
			System.out.println(o1 == o2);
			System.out.println(so1.getValue());
			System.out.println(so2.getValue());
			System.out.println(so1.getValue());
			System.out.println(so2.getValue());
			
			if (so1 == so2) {
				System.out.println("so1 참조변수의 객체와 so2 참조변수의 객체는 같은 객체");
			}
	}

}

class SingleObject {
	//Singleton은 이미 만들어진 참조 변수외에 다른 참조 변수를 만들 필요가 없을 때 쓴다
	private static SingleObject obj = new SingleObject();
	private SingleObject() { //생성자
	}
	
	private int value = 100;
	
	//obj.value;
	public static SingleObject getObject() { //SingleObject.getObject()
		//SingleObject.getObject()
		return obj;
	}
	
	public int getValue() {
		
		return value;
	}
	
	public void setValue(int value) { //obj.value = 5

		this.value = value;
	}
}