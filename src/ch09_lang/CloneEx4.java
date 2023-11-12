package ch09_lang;

public class CloneEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c1 = new Circle2(new Point(1, 1), 2.0);
		Circle2 c2 = c1.deepClone();
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("= c1의 변경 후 =");
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}
}

class Circle2 implements Cloneable {
	Point p;
	double r;
	Circle2(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle2 deepClone() {
		Object obj = null;
		try {
			obj = super.clone();
			Circle2 c = (Circle2) obj;
			c.p = new Point(this.p.x, this.p.y);
		}
		catch (CloneNotSupportedException e) {
			return (Circle2) obj;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Circle [p = " + p + ", r=" + r + "]";
	}
}