package ch03_op;

public class Op_Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//대입 연산자
		int num = 100;
		System.out.println(num);
		num += 10;
		System.out.println(num);
		num /= 10;
		System.out.println(num);
		num *= 2 + 3;
		System.out.println(num);
		
		byte b = 1;
		
		b *= 2;
		b = (byte)(b * 2); //error 
		System.out.println(b);
		
		
	}

}
