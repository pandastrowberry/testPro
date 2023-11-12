package ch03_op;

public class Op_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산과 다른 연산 같이 쓸 때
		int x = 5, y = 0;
		y = x++; //x가 5인 것을 먼저 저장 후, 5 + 1(x = x + 1) 연산하여 x에 저장
		System.out.println("1. x = " + x + ", y = " + y);
		
		y = ++x; //x에 1을 두 번 더한 후, x와 y에 각각 저장
		System.out.println("2. x = " + x + ", y = " + y);
		
		System.out.println("3. x = " + x ++);
		System.out.println("4. x = " + ++ x); //x에 1을 두 번 더한 값을 저장
		
		x = y--; //y값을 저장 후 1을 한 번 뺌
		System.out.println("5. x = " + x + ", y = " + y);
		x = --y; //y 값에서 1을 두 번 뺀 후, x와 y에 저장
		System.out.println("6. x = " + x + ", y = " + y);
	}

}
