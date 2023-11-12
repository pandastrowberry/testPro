package ch04_control;

public class Loop_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 중첩 반복문 : 반복문 내부에 반복문 구현
		 * 구구단 출력
		 */
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 1; j <= 9; j++) {
			
				if (j == 5) continue;
				System.out.println(i + " * " + j + " = " + i * j);	
			}
		}
	}

}
