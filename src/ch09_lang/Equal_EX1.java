package ch09_lang;

public class Equal_EX1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		//e1 = e2;
		System.out.println(e1);
		System.out.println(e2);
		
		if (e1 == e2) { //주소가 다르므로 false
			System.out.println("e1과 e2는 같은 객체"); 
		}
		else {
			System.out.println("e1과 e2는 다른 객체");
		}
		if (e1.equals(e2)) { //value == e.value true
			System.out.println("e1과 e2는 같은 내용의 객체");
		}
		else {
			System.out.println("e1과 e2는 다른 내용의 객체");
		}
	}
}

/*
 * Object 클래스
 * equals 메소드 예제 : 동등을 정의하는 메소드(오버라이딩 필요)
 * => 같은 객체인지 여부는 -> (instance)로 구분 가능
 * => 같은 내용(동등)인지 여부는 -> equals 메소드로 오버라이딩 
 */

class Equal {
	int value;
	
	Equal(int value) {
		this.value = value;
	}
	
	//e1.equals(e2)
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if(obj instanceof Equal) {
			Equal e = (Equal) obj;
			return value == e.value;
		}
		else {
			return false;
		}
	}
}

