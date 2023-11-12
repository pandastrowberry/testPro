package ch03_op;

public class Op_Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*shift 연산자 : 비트 이동 연산자
		<< n : 좌측으로 n비트 이동, 우쪽 n비트 0으로 채움
		>> n : 우측으로 n비트 이동, 좌측 n비트 부호비트 채움
		>>> n : 우측으로 n비트 이동, 좌측 n비트 0으로 채움  
		*/
		System.out.println("8 << 2 : " + (8 << 2));
		/* 8 : 00001000
		 * << 2 : 00010000
		 */
		System.out.println("8 >> 2 : " + (8 >> 2));
		/* 8 : 00001000
		 * >> 2 : 0000010
		 */
		System.out.println("8 >>> 2 : " + (8 >>> 2));
		/* 8 : 00001000
		 * >>> 2 : 00000010
		 */
		
		System.out.println("--------------");
		
		System.out.println("-8 << 2 : " + (-8 << 2));
		/* -8 : 11111000
		 * << 2 : 11110000
		 */
		System.out.println("-8 >> 2 : " + (-8 >> 2));
		/* -8 : 11111000
		 * >> 2 : 11111110
		 */
		System.out.println("-8 >>> 2 : " + (-8 >>> 2));
		/* -8 : 11111000
		 * >>> 2 : 
		 */
	}
}
