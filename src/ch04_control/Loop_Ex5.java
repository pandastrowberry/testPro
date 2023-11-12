package ch04_control;

import java.util.Scanner;

public class Loop_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*무한루프(무한 반복) : 종료가 되지 않는 프로그램
		 * 화면에서 숫자 입력받아서 99999 숫자가 들어오면 입력 종료
		 * 입력 종료시 숫자의 총합과 평균 출력 
		 */
		int sum = 0;
		int cnt = 0;
		System.out.println("숫자를 입력하세요(종료 : 99999)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			int num = scan.nextInt();
			if(num == 99999)break;
			cnt ++;
			sum += num;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double) sum/cnt);
	}

}
