package ch05_array;

import java.util.Scanner;

public class ArrayEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
		피보나찌 수열에서 값이 1000 이전의 수까지 프린트 하세요
		*/
		
		/*int a = 1, b = 1;
		for (int i = 0; a < 1000; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next; 
		}*/
		
		/*int first = 1, second = 1;
		int element = first + second;
			System.out.print(first);
		
		while(element <1000) {
			System.out.print(", " + second);
			element = first + second;
			first = second;
			second = element;
		}*/
		
		/*	
		숫자를 입력하세요 
		8
		***************   1. row/column 확인
		 *************    2. start, end 증감 기준 정하기
		  ***********     
		   *********   
		    *******    
		     *****     
		      ***     
		       *      
		      ***     
		     *****     
		    *******    
		   *********   
		  ***********  
		 ************* 
		***************
		*/	
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a, b = scan.nextInt();
	
		/*for (int i = 0 + 1; i >= num; i++) {
			for (int j = 1 + 1; j >= num * 2 - 1; j++) {
				if (num - i < j && j < num + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= num; i++) { 
			for (int j = 0; j <= num * 2 - 1; j++) {
				if (num - i < j && j < num + i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
	
		/*int start = 1;
		int end = num * 2 - 1;
			for (int i = 1; i <= num * 2 - 1; i++) {
				for (int j = 1; j <= num * 2 - 1; j++) {
					System.out.print((start <= j && j <= end)? "*" : " ");
				}
				if (i < num) {
					start ++;
					end --;
				}else {
					start --;
					end ++;
				}
				System.out.println();
			}*/
		
		/*
		 * 입력된 수 보다 작은 소수를 프린트 하세요 
		 */
		
		/*for (int i = 2; i < num; i++) {
			boolean result = true; //소수인지 아닌지 판단
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					result = false;
					break;
				}
			}
			if (result) {
				System.out.println(i + " ");		
			}
		}*/
		
		/*for (int i = 2; i < num; i++) {
			boolean chk = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					chk = false;
					break;
				}
			}
			if (chk) {
				System.out.print(i + " ");
				
				1<= <= 4000
			}
		}*/
		
		}
}