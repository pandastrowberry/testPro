package ch09_lang;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*지정된 Wrapper 클래스와 기본 자료형사이에는 자동 형변환 가능
		 *이것을 박싱(Boxing)과 언박싱(UnBoxing)이라고 한다  
		 *다른 타입의 Unboxing은 가능
		 *다른 타입의 Boxing 불가
		 *equals(), hashCode(), toString 모두 오버라이딩 되어 있다
		 *compareTo() 오버라이딩
		 */
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		int iii = i; //Unboxing
		double d = (int) i;
		float f = i;
		Short s = (short) (int) i;
		Double d2 = (double) (int) i;
		
		Double d3 = d;//boxing
		
		System.out.println("i==i2?" + (i==i2));
		System.out.println("i.equals(i2)?" + i.equals(i2));
		System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
		System.out.println("i.toString() = " + i.toString());
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + "bits");
		System.out.println("BYTES = " + Integer.BYTES + "bytes");
		System.out.println("TYPE = " + Integer.TYPE);
	}
}