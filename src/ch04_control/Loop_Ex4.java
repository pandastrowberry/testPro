package ch04_control;

public class Loop_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* break : 반복문이나 switch 구문에서 빠져 나옴
		 * switch : 반복문의 처음으로 이동
		 * */
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j + " = " + i * j);	
			}
	}
  }
}
