package ch12_gen_enum_anno;

import java.util.ArrayList;

public class Generic_Ex4 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 상속 안받았기 때문에 에러(타입 불일치)
		//FruitBox<Toy> grapeBox = new FruitBox<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);
		
	}
}

class Fruit implements Eatable {
	   public String toString() { return "Fruit";}
	}
class Apple extends Fruit {
		public String toString() 
		{ return "Apple";
			}
	}
class Grape extends Fruit { 
	public String toString() { 
		return "Grape";
		}
	}
class Toy{ 
	public String toString() { 
		return "Toy"  ;
		}
	}
	interface Eatable {}
	
class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		 list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return "Box [list=" + list + "]";
	}	
}