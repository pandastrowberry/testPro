package ch04_control;

public class Switch_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* switch 구문 자료형
		 * 	=> byte, short, int, char, String(boolean, long, float, double x)
		 * 조건문 : if, switch
		 * 	모든 switch문을 if로 변경 가능
		 * 	모든 if문을 switch로 변경 가능
		 * 	변경 가능한 것도, 아닌 것도 있음
		 * */
		
		int value = 1;
		switch (value) {
			case 1 : System.out.println(value); break;
			case 2 : System.out.println(value); break;
			default :
				System.out.println(value); break;
		}
		
		
	}

}
