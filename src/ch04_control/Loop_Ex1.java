package ch04_control;

public class Loop_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*반복문 예제
		 * for
		 * 	for(초기 값;조건식;증감식) {...}
		 * 	주로 시작과 종료가 지정됐을 때 순차적 처리
		 * 
		 * while
		 * 	while(조건식) {...}
		 * 	비순차적일 때
		 *  ex) 문자가 입력될 때까지
		 *  
		 * do while
		 * 	do{...} while(조건식);
		 * 	비순차적일 때 
		 * 	조건에 상관없이 한 번은 문장 실행 할 때 
		 */
		 System.out.print(1 + " ");
		 System.out.print(2 + " ");
		 System.out.println(3 + " ");
		 
		 System.out.println("for 구문으로 1~ 5까지 출력");
		 for (int i = 1; i <= 5; i++) {
			 System.out.print(i + " ");
		 }
		 System.out.println();
		 
		 System.out.println("while 구문으로 1~ 5까지 출력");
		 int i = 1; //초기화
		 while(i <= 5) {
			 System.out.print(i + " ");
			 i ++;
		 }
		 System.out.println();
		 
		 System.out.println("do while 구문으로 1~ 5까지 출력");
		 i = 1; //초기화
		 do {System.out.print(i + " ");
		 	i ++;
		 } while (i <= 5);
		 System.out.println();
	}
}
