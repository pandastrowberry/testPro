package ch03_op;

public class Op_Ex01 {
	public static void main(String[] args) {
		/* 증감연산자
		  ++ : 숫자의 값 1증가
		  -- : 1 감소
		 */
		int x = 5, y = 5;
		x++; //후위형, x = x + 1
		y--; //y = y -1
		System.out.println("x = " + x + ", y = " + y);
		
		x = y =5;
		++x; //전위형
		--y;
		System.out.println("x = " + x + ", y = " + y);
	}
}
