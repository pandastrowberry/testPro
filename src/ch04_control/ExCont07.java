package ch04_control;

import java.util.Scanner;

public class ExCont07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*(1) + (1 + 2) + (1 + 2 + 3)... = 220
		*/
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i ; j++) {
				sum += j;
				System.out.print(j + (i==j? "" :"+"));
			}
			System.out.print(")" + (i==10? "=":"+"));
			}
			System.out.println(sum);
		}
	}	
