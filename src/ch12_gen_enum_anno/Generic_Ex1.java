package ch12_gen_enum_anno;

public class Generic_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool01 gen = new Pool01(); //Object <-- String type
		gen.set("그랜져");
		String name = (String) gen.get(); //casting 반드시 해야
		System.out.println(name);
		gen.set(new MyClass01()); //Object <-- MyClass type
		MyClass01 g = (MyClass01) gen.get(); //casting 반드시 해야
		//String g2 = (String) gen.get();
		System.out.println(g);
	}
}

//타입을 정하지 않은 변수를 Pool01 class의 멤버로 구현
class MyClass01 {

	@Override
	public String toString() {
		return "MyClass01";
	}
}

class Pool01 {
	private Object object;
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}