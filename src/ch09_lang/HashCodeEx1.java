package ch09_lang;

public class HashCodeEx1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String : (jdk 제공 객체) equals, hashCode 오버라이딩
		 */
		Value v1 = new Value("abc", 100);
		Value v2 = new Value("abc", 100);
		System.out.println(v1.equals(v2));
		System.out.println(v2.equals(v1));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
	}
}

class Value {
	String value;
	int num;
	Value(String value, int num) {
		this.value = value;
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Value) {
			Value e = (Value) obj;
			return value == e.value;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value.hashCode() + num;
	}
}