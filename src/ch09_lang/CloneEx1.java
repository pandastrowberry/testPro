package ch09_lang;

public class CloneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point(3, 5);
		//original.hashCode();
		Point copy = (Point) original.clone(); //복제해서 새로운 객체 생성
		copy.y = 999;
		System.out.println(original);
		System.out.println(copy);
	}
}

class Point implements Cloneable{
	int x, y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	protected Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Point [x = " + x + ", y = " + y + "]"; 
	}
	
	protected Object clone2() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String toString2() {
		return "Point [x = " + x + ", y = " + y + "]"; 
		}
	}	