package ch12_gen_enum_anno;

public class Generic_Ex3 {

	public static void main(String[] args) {
		Product<TV, String>Product1 = new Product<TV, String>();
		Product1.setKind(new TV());
		Product1.setModel("스마트TV");
		TV tv = Product1.getKind();
		String tvModel = Product1.getModel();
		System.out.println(Product1);
		
		Product<Car, String>Product2 = new Product<Car, String>();
		Product2.setKind(new Car());
		Product2.setModel("디젤");
		Car car = Product2.getKind();
		String carModel = Product2.getModel();
		System.out.println(Product2);
	}
}

class Product<T, M> {
	private T kind;
	private M model;
	public T getKind() {
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}
}

class Car {

	@Override
	public String toString() {
		return "Car";
	}
}

class TV {

	@Override
	public String toString() {
		return "TV";
	}
}