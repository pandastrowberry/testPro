package ch12_gen_enum_anno;

public class Generic_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool02<String> gen = new Pool02 <String>(); //Object <-- String type
		
		gen.set("그랜져");
		//MyClass01 g = (MyClass01) gen.get();
		String name = gen.get(); //casting 반드시 해야
		System.out.println(name);
		
		Pool02<MyClass02> gen1 = new Pool02<MyClass02>();
		
		gen1.set(new MyClass02()); //Object <-- MyClass type
		//MyClass01 g = (MyClass01) gen.get(); //casting 반드시 해야
		//String g2 = (String) gen.get();
		MyClass02 g = gen1.get();
		System.out.println(g);
		
		Pool02<Integer> gen2 = new Pool02<Integer>();
		gen2.set(300);
		int num = gen2.get();
		System.out.println(num);
		
	}
}

//제너릭 클래스 
class MyClass02 {

	@Override
	public String toString() {
		return "MyClass02";
	}
}

class Pool02 <T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}