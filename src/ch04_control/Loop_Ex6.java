package ch04_control;

public class Loop_Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 <= Math.random <= 1 : 무작위로 실수 생성
		//0 <= Math.random * 10 < 10
		//0 <= (int)Math.random * 10 < 10
		int row = (int) (Math.random() * 10) + 1;
		int col = (int) (Math.random() * 10) + 1;
		System.out.println("row : " + row + ", col : " + col);
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
