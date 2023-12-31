package ch09_lang;

public class CloneEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.clone();
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("= c1의 변경 후 =");
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}
}

class Circle implements Cloneable {
	Point p;
	double r;
	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}
		catch (CloneNotSupportedException e) {
			return (Circle) obj;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
}