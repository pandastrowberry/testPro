package ch03_op;

import java.util.Scanner;

public class ExOp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12345 초가 몇시간 몇분 몇초인지 출력
		//결과  3시 25분 45초
		int num = 0;
		System.out.println("계산할 초를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println(num / 3600 + "시 " + num % 3600 / 60 + "분 " + num % 60 % 60 + "초");
		
	}

}
