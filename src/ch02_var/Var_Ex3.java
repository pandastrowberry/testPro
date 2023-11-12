package ch02_var;

public class Var_Ex3 {
		public static void main(String[] args) {
			//정수 리터럴은 int
			//실수 리터럴은 double
			byte b1 = 10;
			short s1 = 20;
			int i1 = 100;
			long l1 = 1000;
			i1 = b1; //int(4바이트) <= byte(1byte) auto casting type
			s1 = (short) l1; //2byte <= 4byte 명시적 형변환
			float f = l1;
			l1 = (long)f;
			
		}
}
