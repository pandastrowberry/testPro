package ch04_control;

public class Loop_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 반복문을 이용해서 1~ 10까지 합 출력
		 */
		System.out.println("for문 이용");
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			 sum += i;
		 }
		System.out.println("1~ 10까지 합 : " + sum);
		
		System.out.println("while문 이용");
		i = 1; //초기화
		sum = 0;
		while(i <= 10) {
		 sum += i;
		 i++;
	 }
		System.out.print("1~ 10까지 합 : " + sum);
		
		System.out.println();
		
		System.out.println("do while문 이용");
		 i = 1; //초기화
		 sum = 0;
		 do {
		 	sum += i;
		 	i++;
		 } while (i <= 10);
		 System.out.print("1~ 10까지 합 : " + sum);
		 System.out.println();
	}
		
	 
	
}
