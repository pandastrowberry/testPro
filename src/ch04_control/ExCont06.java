package ch04_control;

import java.util.Scanner;

public class ExCont06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 1~ 100 중에서 2의 배수이거나 3의 배수의 합
		 * 
		 *2. 2의 배수도 아니고, 3의 배수도 아닌 수 합
		 *
		 *
		*/
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		boolean a = num % 2 == 0;
		boolean b = num % 3 == 0;
		
		int sum = 0;
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (a || b) {
				sum += i;
			}
			else {
				sum1 += i; 
			}
		}
		System.out.println("2의 배수이거나 3의 배수의 합 : " + sum);
		System.out.println("2의 배수도 아니고, 3의 배수도 아닌 수 합 : " + sum1);
	}
}	
