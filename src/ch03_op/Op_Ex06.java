package ch03_op;

public class Op_Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6 & 3 = " + (6 & 3)); 
		/*6 : 0110
		 *3 : 0011
		 *---------
		 *&   0010 : 2
		 */
		System.out.println("6 | 3 = " + (6 | 3));
		/*6 : 0110
		 *3 : 0011
		 *---------
		 *|   0111 : 7
		 */
		System.out.println("6 ^ 3 = " + (6 ^ 3));
		/*6 : 0110
		 *3 : 0011
		 *---------
		 *^   0101 : 5
		 */
		System.out.println("~10 = " + ~10);
		/*6 : 0110
		 *3 : 0011
		 *---------
		 *~   0010 : -11
		 */
	}

}
